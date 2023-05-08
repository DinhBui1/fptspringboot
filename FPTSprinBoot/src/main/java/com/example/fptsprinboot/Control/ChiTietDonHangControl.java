package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import com.example.fptsprinboot.Service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChiTietDonHangControl {
    @Autowired
    private ChiTietDonHangService serv;

    @GetMapping("/ctdh")
    public List<ChiTietDonHang> getallCTDH()
    {
        return  serv.getallCTDH();
    }
}
