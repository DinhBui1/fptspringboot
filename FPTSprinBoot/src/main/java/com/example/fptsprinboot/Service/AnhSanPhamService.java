package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.AnhSanPham;
import com.example.fptsprinboot.Repository.AnhSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnhSanPhamService {
    @Autowired
    private AnhSanPhamRepository repo;

    public AnhSanPham getAnhSPByID(int id)
    {
        return repo.getAnhSPByID(id);
    }
    public void addAnhSP(int id, String anh)
    {
        AnhSanPham asp=new AnhSanPham(id,anh);
        repo.save(asp);
    }
    public void deleteAnhSP(int id, String anh)
    {

        AnhSanPham asp = repo.getAnhSPByID(id);
        repo.delete(asp);
    }
}
