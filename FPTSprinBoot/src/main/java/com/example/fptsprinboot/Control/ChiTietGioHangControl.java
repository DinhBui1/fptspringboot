package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Service.ChiTietGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ChiTietGioHang createCTGH(@RequestBody  ChiTietGioHang chiTietGioHang,@RequestParam("id") int id)
    {
        return  serv.createCTGH(chiTietGioHang,id);
    }

    @GetMapping("/ctghbyid")
    public List<ChiTietGioHang> getallCTGHById(@RequestParam("id") int id)
    {
        return  serv.getAllChiTietGioHangById(id);
    }
}
