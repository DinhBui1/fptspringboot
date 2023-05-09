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

    public ChiTietDonHang getCTDHByID(int id)
    {
        return repo.getChiTietDonHangByID(id);
    }

    public  ChiTietDonHang createCTDH(ChiTietDonHang chiTietDonHang)
    {
        return repo.save(chiTietDonHang);
    }
    public ChiTietDonHang updateCTDH(int id ,ChiTietDonHang chiTietDonHang)
    {
        if(chiTietDonHang!=null)
        {
            ChiTietDonHang ctdh=repo.getChiTietDonHangByID(id);
            if(ctdh!=null)
            {

                ctdh.setDonHang(chiTietDonHang.getDonHang());
                ctdh.setSanPham2(chiTietDonHang.getSanPham2());
                ctdh.setSoLuong(chiTietDonHang.getSoLuong());
                ctdh.setTongTien(chiTietDonHang.getTongTien());
                return  repo.save(ctdh);
            }
        }
        return null;
    }
}
