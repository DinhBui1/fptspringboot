package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.*;
import com.example.fptsprinboot.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DonHangService {
    @Autowired
    private DonHangRepository repo;

    @Autowired
    private GioHangRepository repo2;

    @Autowired
    private ChiTietGioHangRepository repo3;

    @Autowired
    private SanPhamRepository repo4;

    @Autowired
    private ChiTietDonHangRepository repo5;


    public List<DonHang> getAllDonHang()
    {
        return repo.findAll();
    }

    public DonHang createDonHang(DonHang donHang)
    {
        donHang.setNgayDatHang(new Date());
        repo.save(donHang);
        int makh = donHang.getKhachHang().getMaKH();
        GioHang gh= repo2.getGioHangByKhachHang(makh);
        int magh= gh.getMaGH();
        List<ChiTietGioHang> chiTietGioHangs =repo3.getAllChiTietGioHangByID(magh);
        for (ChiTietGioHang i :chiTietGioHangs) {
            ChiTietDonHang ctdh = new ChiTietDonHang();
            ctdh.setDonHang(donHang);
            ctdh.setSoLuong(i.getSoLuong());
            ctdh.setTongTien(donHang.getTongTien());
            SanPham sp= repo4.getSanPhamByMaSP(i.getSanPham3().getMaSP());
            ctdh.setSanPham2(sp);
            repo5.save(ctdh);
            repo3.delete(i);
        }
        return donHang;

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
