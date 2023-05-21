package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.DanhGia;
import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Service.DanhGiaService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DanhGiaControl {

    @Autowired
    private DanhGiaService serv;

    @GetMapping("/danhgiabymasp")
    public List<DanhGia> getDanhGiaByMaSP(@RequestParam("masp") int masp)
    {
        return serv.getallDanhGiaByMaSP(masp);
    }
    @PostMapping("/danhgia")
    public DanhGia createDanhGia(@RequestBody DanhGia danhGia)
    {
        return serv.createDanhGia(danhGia);
    }
    @PostMapping("/listdanhgia")
    public List<DanhGia> createDanhGia(@RequestBody List<DanhGia> danhGiaList) {
        return serv.createListDanhGai(danhGiaList);
    }
    @PutMapping("/danhgia")
    public DanhGia updateDanhGia(@RequestBody DanhGia danhGia)
    {
        return serv.updateDanhGia(danhGia);
    }
    @DeleteMapping("/danhgia")
    public void deleteDanhGia(@RequestParam("madg") int madg)
    {
        serv.deleteDanhGia(madg);
    }
}
