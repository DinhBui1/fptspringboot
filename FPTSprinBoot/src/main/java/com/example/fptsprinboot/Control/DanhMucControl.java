package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DanhMucControl {

    @Autowired
    public DanhMucService serv;

    @GetMapping("/danhmuc")
    public List<DanhMuc> getAllDanhMuc()
    {
        return  serv.getAllDanhMuc();
    }

    @PostMapping("/danhmuc")
    public DanhMuc createDanhMuc(@RequestBody DanhMuc danhMuc)
    {
        return serv.createdanhmuc(danhMuc);
    }

    @PutMapping("/danhmuc")
    public  DanhMuc updateDanhMuc(@RequestParam("id") int id,@RequestBody DanhMuc danhMuc)
    {
        return serv.updateDanhMuc(id,danhMuc);
    }
    @GetMapping("/danhmucid")
    public  DanhMuc getDmbyid(@RequestParam("id") int id)
    {
        return  serv.getDanhMucbyID(id);
    }
}
