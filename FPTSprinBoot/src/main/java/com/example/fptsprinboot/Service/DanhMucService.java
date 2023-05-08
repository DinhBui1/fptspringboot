package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    private DanhMucRepository repo;

    public List<DanhMuc> getAllDanhMuc()
    {return repo.findAll();}

    public List<DanhMuc> getDanhMucByMaLoai(int maLoai)
    {return  repo.getDanhMucByMaLoai(maLoai);}

    public void addDanhMuc(int MaLoai, String TenDM)
    {DanhMuc dm= new DanhMuc(MaLoai,TenDM);
    repo.save(dm);
    }

    public DanhMuc taodanhmuc(DanhMuc danhMuc)
    {
        return repo.save(danhMuc);
    }
}
