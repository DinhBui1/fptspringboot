package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.KhachHang;
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

    @GetMapping("/sanpham-by-dm-not-delete")
    public List<SanPham> getSanPhamByDanhMucNotDelete(@RequestParam("maDM") int maDM){return serv.getAllsanphamNotDelete(maDM);}
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
    @GetMapping("/top8")
    public List<SanPham> gettop8SanPham()
    {
        return serv.get8SanPham();
    }

    @GetMapping("/top8notdelete")
    public List<SanPham> gettop8SanPhamNotDelete()
    {
        return serv.get8SanPhamNotDelete();
    }

    @GetMapping("/sanphambymasp")
    public SanPham getSanPham(@RequestParam("id")int id){return serv.getSPbyMaSP(id);}
    @GetMapping("/timkiem")
    public List<SanPham> timkiemsanpham(@RequestParam("key") String key){
        return  serv.timkiemSanPham(key);
    }
}
