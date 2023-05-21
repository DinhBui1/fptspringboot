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
    @GetMapping("/checkemail")
    public KhachHang checkemail(@RequestParam("email")String email)
    {
        return serv.checkemail(email);
    }
    @PostMapping("/khachhang-login")
        public KhachHang getKhachHang(@RequestParam("email") String email, @RequestParam("password") String password){
        return serv.getKhachHangByUsernamevsPassword(email,password);
    }
    @PostMapping("/admin-login")
    public KhachHang getAdmin(@RequestParam("email") String email, @RequestParam("password") String password){
        return serv.getAdminByUsernamevsPassword(email,password);
    }

}
