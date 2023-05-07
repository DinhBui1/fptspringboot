package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.SanPham;
import com.example.fptsprinboot.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SanPhamControl {

    @Autowired
    private SanPhamService serv;

    @GetMapping("/sanpham")
    public List<SanPham> getAllSanPham()
    {
        return serv.getall();
    }
}
