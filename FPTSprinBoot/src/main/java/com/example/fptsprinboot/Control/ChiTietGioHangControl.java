package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Service.ChiTietGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChiTietGioHangControl {
    @Autowired
    private ChiTietGioHangService serv;

    @GetMapping("/ctgh")
    public List<ChiTietGioHang> getallCTGH()
    {
        return serv.getAllChiTietGioHang();
    }

    @PostMapping("/ctgh")
    public ChiTietGioHang createCTGH(ChiTietGioHang chiTietGioHang)
    {
        return  serv.createCTGH(chiTietGioHang);
    }
}
