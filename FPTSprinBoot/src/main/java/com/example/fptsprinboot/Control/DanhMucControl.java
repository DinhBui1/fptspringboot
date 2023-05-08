package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        return serv.taodanhmuc(danhMuc);
    }
}
