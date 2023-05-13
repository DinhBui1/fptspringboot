package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.KhachHang;
import com.example.fptsprinboot.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/khachhang")
    public KhachHang createKhachHang(@RequestBody  KhachHang khachHang)
    {
        return  serv.createKhachHang(khachHang);
    }

    @PutMapping("/khachhang")
    public  KhachHang updateKhachHang(@RequestParam("id") int id,@RequestBody KhachHang khachHang)
    {
        return  serv.updateKhachHang(id, khachHang);
    }
    @GetMapping("/dangnhap")
    public  String dangnhap(@RequestParam("tentk") String tentk, @RequestParam("mk") String mk)
    {
        KhachHang kh= serv.dangnhap(tentk,mk);
        if(kh!=null)
        {
            return "Success";
        }
        return "Failure";
    }
    @PostMapping("/dangky")
    public  KhachHang dangky(@RequestBody KhachHang khachHang)
    {
        return serv.createKhachHang(khachHang);
    }

}
