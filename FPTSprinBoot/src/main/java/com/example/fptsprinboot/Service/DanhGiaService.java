package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.DanhGia;
import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Repository.DanhGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DanhGiaService {

    @Autowired
    private DanhGiaRepository repo;

    public List<DanhGia> getallDanhGiaByMaSP(int masp)
    {
        return repo.getallDanhGiaByMaSP(masp);
    }
    public List<DanhGia> getallDanhGiaByMaKH(int makh)
    {
        return repo.getallDanhGiaByMaKH(makh);
    }
    public  DanhGia getDanhGiaByMaDG(int madg)
    {
        return  repo.getDanhGiaByMaDG(madg);
    }
    public DanhGia createDanhGia(DanhGia danhGia)
    {
        return  repo.save(danhGia);
    }

    public List<DanhGia> createListDanhGai(List<DanhGia> listDanhGia) {
        List<DanhGia> savedList = new ArrayList<>();
        for (DanhGia d : listDanhGia) {
            savedList.add(repo.save(d));
        }
        return savedList;
    }


    public DanhGia updateDanhGia(DanhGia danhGia)
    {
        DanhGia dg =repo.getDanhGiaByMaDG(danhGia.getMaDG());
        if(dg!=null)
        {
            dg.setNoiDung(danhGia.getNoiDung());
            dg.setVote(danhGia.getVote());
            return repo.save(dg);
        }
        return  null;
    }
    public void deleteDanhGia(int maDG)
    {
        DanhGia dg=repo.getDanhGiaByMaDG(maDG);
        repo.delete(dg);
    }

    public double getAverageDanhGia(int maSP){
        return repo.getAverageDanhGia(maSP);
    }

}
