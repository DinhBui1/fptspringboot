package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.BaiViet;
import com.example.fptsprinboot.Repository.BaiVietRepository;
import com.example.fptsprinboot.Service.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BaiVietControl {
    @Autowired
    private BaiVietService serv;

    @GetMapping("/baiviet")
    public List<BaiViet> getallBaiViet()
    {
        return serv.getallBaiViet();
    }
    @PostMapping("/baiviet")
    public BaiViet createBaiViet(@RequestBody BaiViet baiViet)
    {
        return serv.createBaiViet(baiViet);
    }
    @PutMapping("/baiviet")
    public  BaiViet updateBaiViet(@RequestParam("id") int id,@RequestBody BaiViet baiViet)
    {
        return serv.updateBaiViet(id, baiViet);
    }


}
