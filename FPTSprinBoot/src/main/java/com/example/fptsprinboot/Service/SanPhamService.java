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
    public void addSanPham(int MaDM,String TenSP, String MoTa, int GiaGoc, int GiaBanThuong,int GiaKhuyenMai, int SoLuong,String Anh,String MoTaNgan)
    {
        SanPham sp=new SanPham(MaDM,TenSP,MoTa,GiaGoc,GiaBanThuong,GiaKhuyenMai,SoLuong,Anh,MoTaNgan,'0');
        repo.save(sp);
    }
    public void updateSanPham(int MaDM,String TenSP, String MoTa, int GiaGoc, int GiaBanThuong,int GiaKhuyenMai, int SoLuong,String Anh,String MoTaNgan,int maSP)
    {
        repo.UpdateCustomerInfo(maSP,MaDM,TenSP,MoTa,GiaGoc,GiaBanThuong,GiaKhuyenMai,SoLuong,Anh,MoTaNgan);
    }
    public  void deleteSP(int maSP)
    {
        SanPham sp=repo.getSanPhamByMaSP(maSP);
        repo.delete(sp);
    }
    public SanPham create(SanPham sanPham)
    {
        return  repo.save(sanPham);
    }
}
