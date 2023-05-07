package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.LoaiSanPham;
import com.example.fptsprinboot.Repository.LoaiSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamService {
    @Autowired
    private LoaiSanPhamRepository repo;

    public List<LoaiSanPham> getAllloaisp()
    {return repo.findAll();}

    public  LoaiSanPham createLoaisp(String tenloai)
    {
        LoaiSanPham lsp=new LoaiSanPham(tenloai);
        repo.save(lsp);
        return lsp;
    }

}
