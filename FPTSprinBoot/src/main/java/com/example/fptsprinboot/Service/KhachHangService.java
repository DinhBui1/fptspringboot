package com.example.fptsprinboot.Service;

import com.example.fptsprinboot.Model.KhachHang;
import com.example.fptsprinboot.Repository.KhachHangRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository repo;
    @PersistenceContext
    private EntityManager entityManager;
    public List<KhachHang> getAllKhachHang()
    {return repo.findAll();}

    public KhachHang saveKhachHang(KhachHang khachHang)
    {return repo.save(khachHang);}
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
    public void addKhachHang(String tenKH, String DiaChi,String SoDT,String Email)
    {
        KhachHang kh=new KhachHang(tenKH,Email,SoDT,DiaChi,'0','0','0');
        repo.save(kh);

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
}
