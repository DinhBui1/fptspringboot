package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.DonHang;
import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DonHangControl {
    @Autowired
    private DonHangService serv;

    @GetMapping("/donhang")
    public List<DonHang> getallDonHang()
    {
        return serv.getAllDonHang();
    }
}
