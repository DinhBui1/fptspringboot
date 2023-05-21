package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Integer> {
    @Query("SELECT u FROM KhachHang u WHERE (u.isAdmin = 0  and u.isUser = 1)")
    List<KhachHang> getAllKhachHangQuen();

    @Query("SELECT u FROM KhachHang u WHERE (u.isAdmin = 0 and u.isUser = 0)")
    List<KhachHang> getAllKhachHangLa();
    @Query("SELECT u FROM KhachHang u WHERE u.phone = ?1")
    KhachHang getKhachHangByPhone(String sdt);
    @Query("SELECT u FROM KhachHang u WHERE u.email = ?1")
    KhachHang checkemail(String email);
   @Modifying
    @Query("UPDATE KhachHang u SET u.tenKH = :name,u.phone=:phone,u.email=:email,u.diaChi=:diachi WHERE u.maKH = :id")
    void UpdateCustomerInfo(@Param("id") int MaKH, @Param("name") String TenKH, @Param("phone") String Phone, @Param("email") String Email, @Param("diachi") String DiaChi);

    @Modifying
    @Query("UPDATE KhachHang u SET u.mK = :mk WHERE u.maKH = :id")
    void ChangePassWord(@Param("id") int MaKH, @Param("mk") String MK);

    @Query("SELECT u FROM KhachHang u WHERE u.maKH = ?1")
    KhachHang getKhachHangByID(int id);
    @Query("SELECT u FROM KhachHang u WHERE u.tenTK=?1 and  u.mK=?2")
    KhachHang dangnhap(String tentk, String mk);

    @Query("SELECT u FROM KhachHang u WHERE u.email = ?1 and u.mK = ?2")
    KhachHang getKhachHangByPWAndUsername(String email, String password);

    @Query("SELECT u FROM KhachHang u WHERE u.isUser = 1 and u.isAdmin = 0")
    List<KhachHang> getAllUsers();

}
