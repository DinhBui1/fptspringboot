package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.SanPham;
import com.example.fptsprinboot.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SanPhamControl {

    @Autowired
    private SanPhamService serv;

    @GetMapping("/sanpham")
    public List<SanPham> getAllSanPham()
    {
        return serv.getall();
    }

    @GetMapping("/sanpham-by-dm")
    public List<SanPham> getSanPhamByDanhMuc(@RequestParam("maDM") int maDM){return serv.getAllsanpham(maDM);}
    @PostMapping("/sanpham")
    public SanPham createSanPham(@RequestBody SanPham sanPham)
    {
        return serv.create(sanPham);
    }
    @PutMapping("/sanpham")
    public SanPham updateSanPham(@RequestParam("id") int id,@RequestBody SanPham sanPham)
    {
        return serv.updateSanPham(id,sanPham);
    }
    @PutMapping("/deletesp")
    public  SanPham deleteSanPham(@RequestParam("id") int id)
    {
        return serv.deleteSanPham(id);
    }
}
