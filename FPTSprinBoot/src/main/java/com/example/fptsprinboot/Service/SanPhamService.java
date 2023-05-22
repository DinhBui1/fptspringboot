package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.SanPham;
import com.example.fptsprinboot.Repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository repo;

    public List<SanPham> getall()
    {
        return  repo.findAll();
    }
    public List<SanPham> getAllsanpham(int madm)
    {return repo.getSanPhamByMaDM(madm);}

    public SanPham getmaloaibymasp(int masp)
    {
        return repo.getSanPhamByMaSP(masp);
    }
    public String gettensp(int masp)
    {
        SanPham sp= repo.getSanPhamByMaSP(masp);
        return sp.getTenSP();
    }
    public  SanPham deleteSanPham(int maSP)
    {
        SanPham sp=repo.getSanPhamByMaSP(maSP);
        if(sp!=null)
        {
            // xóa
            if(sp.getIsDeteted()==0){
                sp.setIsDeteted(1);
            }
            else {
                // khôi phục
                sp.setIsDeteted(0);
            }
            return repo.save(sp);
        }
        return  null;
    }
    public SanPham create(SanPham sanPham)
    {
        return  repo.save(sanPham);
    }
    public List<SanPham> get8SanPham()
    {
        return  repo.get8SanPham();
    }
    public SanPham updateSanPham(int id, SanPham sanPham)
    {
        if(sanPham!=null)
        {
            SanPham sp=repo.getSanPhamByMaSP(id);
            if(sp!=null)
            {
                sp.setDanhMuc(sanPham.getDanhMuc());
                sp.setTenSP(sanPham.getTenSP());
                sp.setMoTa(sanPham.getMoTa());
                sp.setMoTaNgan(sanPham.getMoTaNgan());
                sp.setGiaGoc(sanPham.getGiaGoc());
                sp.setGiaBanThuong(sanPham.getGiaBanThuong());
                sp.setGiaKhuyenMai(sanPham.getGiaKhuyenMai());
                sp.setSoLuong(sanPham.getSoLuong());
                sp.setAnh(sanPham.getAnh());
                sp.setIsDeteted(0);
                return repo.save(sp);
            }

        }
        return null;
    }
    public List<SanPham> timkiemSanPham(String keyword)
    {
        return repo.timkiemSanPham(keyword);
    }
    public SanPham getSPbyMaSP(int id){
        return repo.getSanPhamByMaSP(id);
    }
}
