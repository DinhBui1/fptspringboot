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


    public DanhMuc createdanhmuc(DanhMuc danhMuc)
    {
        return repo.save(danhMuc);
    }

    public  DanhMuc getDanhMucbyID(int id)
    {
        return  repo.getDanhMucByID(id);
    }
    public DanhMuc updateDanhMuc(int id, DanhMuc danhMuc)
    {
        if(danhMuc!=null)
        {
            DanhMuc dm =repo.getDanhMucByID(id);
            if(dm!=null)
            {

                dm.setTenDM(danhMuc.getTenDM());
                return repo.save(dm);
            }

        }
        return null;
    }
}
