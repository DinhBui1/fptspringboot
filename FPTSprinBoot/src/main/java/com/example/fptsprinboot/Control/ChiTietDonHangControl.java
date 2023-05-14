package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import com.example.fptsprinboot.Service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/ctdh")
    public ChiTietDonHang createCTDH(@RequestBody ChiTietDonHang chiTietDonHang)
    {
        return  serv.createCTDH(chiTietDonHang);
    }

    @PutMapping("/ctdh")
    public  ChiTietDonHang updateCTDH(@RequestParam("id") int id, @RequestBody ChiTietDonHang chiTietDonHang)
    {
        return serv.updateCTDH(id,chiTietDonHang);
    }

    @GetMapping("/ctdhbymadh")
    public  List<ChiTietDonHang> getCTDHByMaDH(@RequestParam("id") int id)
    {
        return  serv.getCTDHByMaDH(id);
    }
}
