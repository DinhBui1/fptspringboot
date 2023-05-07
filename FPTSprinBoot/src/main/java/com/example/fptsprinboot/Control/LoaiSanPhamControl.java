package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.LoaiSanPham;
import com.example.fptsprinboot.Service.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoaiSanPhamControl {

    @Autowired
    public LoaiSanPhamService serv;

    @GetMapping("/loaisanpham")
    public List<LoaiSanPham>  getAllLoaiSanPham()
    {
        return serv.getAllloaisp();
    }

    @PostMapping("/loaisanpham")
    public LoaiSanPham createLoaisp(@RequestBody String tenloai)
    { return serv.createLoaisp(tenloai);}
}
