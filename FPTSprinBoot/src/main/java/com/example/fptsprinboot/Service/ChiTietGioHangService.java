package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Repository.ChiTietGioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietGioHangService {
    @Autowired
    private ChiTietGioHangRepository repo;

    public List<ChiTietGioHang> getAllChiTietGioHang()
    {
        return  repo.findAll();
    }
    public  List<ChiTietGioHang> getAllChiTietGioHangById(int magh)
    {
        return repo.getAllChiTietGioHangByID(magh);
    }

    public ChiTietGioHang createCTGH(ChiTietGioHang chiTietGioHang)
    {
        return repo.save(chiTietGioHang);
    }
}
