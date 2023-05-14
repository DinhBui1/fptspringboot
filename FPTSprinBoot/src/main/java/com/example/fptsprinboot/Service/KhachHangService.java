package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Model.KhachHang;
import com.example.fptsprinboot.Repository.GioHangRepository;
import com.example.fptsprinboot.Repository.KhachHangRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository repo;

    @Autowired
    private GioHangRepository repo2;


    @PersistenceContext
    private EntityManager entityManager;
    public List<KhachHang> getAllKhachHang()
    {return repo.findAll();}

    public KhachHang createKhachHang(KhachHang khachHang)
    {
        GioHang gh = new GioHang(khachHang,0);
        khachHang.setIsUser(1);
        repo.save(khachHang);
        repo2.save(gh);
        return khachHang;
    }
    public  void deleteKhachHangbyId(int id)
    {
        repo.deleteById(id);
    }
    public   List<KhachHang> getAllKhachHangQuen()
    {
        return repo.getAllKhachHangQuen();
    }
    public List<KhachHang> getAllKhachHangLa()
    {
        return  repo.getAllKhachHangLa();
    }
    public KhachHang getKhachHangByPhone(String sdt)
    {
        return repo.getKhachHangByPhone(sdt);
    }

    public KhachHang getKhachHangByMaKH(int id)
    {return repo.findById(id).orElse(null);}
    public KhachHang getKhachHangByMaTK(int MaTK)
    {return repo.findById(MaTK).orElse(null);}
    public void UpdateCustomerInfo(int MaKH, String TenKH, String Phone, String Email, String DiaChi)
    {
        repo.UpdateCustomerInfo(MaKH,TenKH, Phone, Email, DiaChi);
    }
    public  void ChangePassWord(int id, String newPass)
    {
        repo.ChangePassWord(id,newPass);
    }
    public KhachHang updateKhachHang(int id,KhachHang khachHang)
    {
        if(khachHang!=null)
        {
            KhachHang kh=repo.getKhachHangByID(id);
            if(kh!=null)
            {
                kh.setDiaChi(khachHang.getDiaChi());
                kh.setEmail(khachHang.getEmail());
                kh.setIsAdmin(kh.getIsAdmin());
                kh.setIsUser(khachHang.getIsUser());
                kh.setmK(khachHang.getmK());
                kh.setTenKH(khachHang.getTenKH());
                kh.setTenTK(khachHang.getTenTK());
                return repo.save(kh);
            }
        }
        return  null;
    }
    public KhachHang getKhachHangByID(int id)
    {
        return  repo.getKhachHangByID(id);
    }
    public KhachHang dangnhap(String tentk, String mk)
    {
        KhachHang kh =repo.dangnhap(tentk,mk);
        if(kh!=null)
        {
            return kh;
        }
        return  null;
    }

    public KhachHang getKhachHangByUsernamevsPassword(String email, String password){return  repo.getKhachHangByPWAndUsername(email,password);}

}
