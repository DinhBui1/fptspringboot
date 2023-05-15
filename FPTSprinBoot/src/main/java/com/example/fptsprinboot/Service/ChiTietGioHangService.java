package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Repository.ChiTietGioHangRepository;
import com.example.fptsprinboot.Repository.GioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietGioHangService {
    @Autowired
    private ChiTietGioHangRepository repo;

    @Autowired
    private GioHangRepository repo2;

    public List<ChiTietGioHang> getAllChiTietGioHang()
    {
        return  repo.findAll();
    }
    public  List<ChiTietGioHang> getAllChiTietGioHangById(int magh)
    {
        return repo.getAllChiTietGioHangByID(magh);
    }

    public ChiTietGioHang createCTGH(ChiTietGioHang chiTietGioHang,int idkh)
    {
        int id= chiTietGioHang.getSanPham3().getMaSP();
        GioHang gh =repo2.getGioHangByKhachHang(idkh);
        ChiTietGioHang ctgh = repo.getAllChiTietGioHangByMaSP(id,gh.getMaGH());
        if(ctgh!=null)
        {
            int sl_them = chiTietGioHang.getSoLuong();
            int sl_co = ctgh.getSoLuong();
            ctgh.setSoLuong(sl_co+sl_them);
            return repo.save(ctgh);
        }
        else
        {
            chiTietGioHang.setGioHang(gh);
            chiTietGioHang.setIdDelete(0);
            return  repo.save(chiTietGioHang);
        }
    }
    public ChiTietGioHang updateSoLuong(int id,ChiTietGioHang chiTietGioHang)
    {
        GioHang gh= repo2.getGioHangByKhachHang(id);
        ChiTietGioHang ctgh =repo.getAllChiTietGioHangByMaSP(chiTietGioHang.getSanPham3().getMaSP(),gh.getMaGH());
        ctgh.setSoLuong(chiTietGioHang.getSoLuong());
        return repo.save(ctgh);

    }
    public  ChiTietGioHang getCTGHByMaCTGH(int mactgh)
    {
        return repo.getAllChiTietGioHangByMaCTGH(mactgh);
    }
    public  ChiTietGioHang updateIsDelete(int mactgh)
    {
        ChiTietGioHang chiTietGioHang = repo.getAllChiTietGioHangByMaCTGH(mactgh);
        chiTietGioHang.setIdDelete(1);
        return repo.save(chiTietGioHang);
    }

    public ChiTietGioHang deleteCartItem(int idKH, int idSP){
        GioHang gh = repo2.getGioHangByKhachHang(idKH);
        ChiTietGioHang chiTietGioHang = repo.getAllChiTietGioHangByMaSP(idSP,gh.getMaGH());
        repo.delete(chiTietGioHang);
        return chiTietGioHang;
    }

    public  ChiTietGioHang getCTGHByMaSP(int id,int idkh)
    {
        return repo.getAllChiTietGioHangByMaSP(id,idkh);
    }


}
