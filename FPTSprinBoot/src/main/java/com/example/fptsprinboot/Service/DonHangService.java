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

    public DonHang createDonHang(DonHang donHang)
    {
        return repo.save(donHang);
    }
    public DonHang getDonHangByID(int id)
    {
        return  repo.getDonHangById(id);
    }
    public DonHang updateDonHang(int id, DonHang donHang)
    {
        if(donHang!=null)
        {
            DonHang dh=repo.getDonHangById(id);
            if(dh!=null)
            {
                dh.setKhachHang(donHang.getKhachHang());
                dh.setTrangThai(donHang.getTrangThai());
                dh.setNgayDatHang(donHang.getNgayDatHang());
                dh.setDiaChi(donHang.getDiaChi());
                dh.setTongTien(donHang.getTongTien());
                return repo.save(dh);
            }
        }
        return null;
    }

    public List<DonHang> getDonHangByMaKH(int id)
    {
        return repo.getDonHangByMaKh(id);
    }

}
