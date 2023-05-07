package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.BaiViet;
import com.example.fptsprinboot.Repository.BaiVietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiVietService {
    @Autowired
    private BaiVietRepository repo;

    public List<BaiViet> getallBaiViet()
    {
        return  repo.findAll();
    }
}
