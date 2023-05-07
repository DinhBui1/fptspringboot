package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import com.example.fptsprinboot.Repository.ChiTietDonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangService {
    @Autowired
    private ChiTietDonHangRepository repo;

    public List<ChiTietDonHang> getallCTDH()
    {
        return repo.findAll();
    }

}
