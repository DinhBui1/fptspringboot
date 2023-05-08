package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.KhachHang;
import com.example.fptsprinboot.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KhachHangControl {

    @Autowired
    private KhachHangService serv;

    @GetMapping("/khachhang")
    public List<KhachHang> getallKhachHang()
    {
        return serv.getAllKhachHang();
    }
}
