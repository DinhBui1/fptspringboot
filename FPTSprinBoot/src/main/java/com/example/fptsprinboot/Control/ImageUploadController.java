package com.example.fptsprinboot.Control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@RestController
public class ImageUploadController {

    @Value("${upload.directory}")
    private String uploadDirectory;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestPart("image") MultipartFile image) {
        try {
            // Tạo tên ngẫu nhiên cho tệp tin
            String fileName = UUID.randomUUID().toString() + "-" + image.getOriginalFilename();

            // Kiểm tra và tạo thư mục lưu trữ nếu không tồn tại
            File uploadDir = new File(uploadDirectory);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Lưu tệp tin vào thư mục lưu trữ
            String filePath = uploadDirectory + File.separator + fileName;
            Path destination = Path.of(filePath);
            Files.copy(image.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);

            // Tạo URL hoàn chỉnh cho tệp tin đã tải lên
            String fileUrl = "http://10.0.2.2:8080/myapp/img/" + fileName;

            return ResponseEntity.ok(fileUrl);
        } catch (IOException e) {
            // Xử lý lỗi khi tải lên tệp tin
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body("Lỗi khi tải lên tệp tin");
        }
    }
}
