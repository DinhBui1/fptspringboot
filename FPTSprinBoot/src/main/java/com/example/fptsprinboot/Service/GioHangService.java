package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Repository.GioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangService {
    @Autowired
    private GioHangRepository repo;

    public List<GioHang> getAllGioHang()
    {
        return  repo.findAll();
    }

    public GioHang getGioHangbyKhangHang(int makh)
    {
        return repo.getGioHangByKhachHang(makh);
    }

}
