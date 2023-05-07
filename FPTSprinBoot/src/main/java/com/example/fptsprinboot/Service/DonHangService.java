package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.DonHang;
import com.example.fptsprinboot.Repository.DonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangService {
    @Autowired
    private DonHangRepository repo;

    public List<DonHang> getAllDonHang()
    {
        return repo.findAll();
    }

}
