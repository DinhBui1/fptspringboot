package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.DonHang;
import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/donhang")
    public DonHang createDonHang(@RequestBody DonHang donHang)
    {
        return  serv.createDonHang(donHang);
    }
    @PutMapping("/donhang")
    public  DonHang updateDonHang(@RequestParam("id") int id,@RequestBody DonHang donHang)
    {
        return serv.updateDonHang(id, donHang);
    }
    @GetMapping("/donhangbymakh")
    public  List<DonHang> getDonHangByMaKh(@RequestParam("id") int id)
    {
        return serv.getDonHangByMaKH(id);
    }
}
