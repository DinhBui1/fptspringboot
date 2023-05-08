package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GioHangControl {
    @Autowired
    private GioHangService serv;

    @GetMapping("/giohang")
    public List<GioHang> getallGioHang()
    {
        return serv.getAllGioHang();
    }
}
