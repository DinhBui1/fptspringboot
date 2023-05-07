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
    @Query("SELECT u FROM KhachHang u WHERE (u.IsAdmin = 0 and u.IsShiper = 0 and u.IsUser = 1)")
    List<KhachHang> getAllKhachHangQuen();

    @Query("SELECT u FROM KhachHang u WHERE (u.IsAdmin = 0 and u.IsShiper = 0 and u.IsUser = 0)")
    List<KhachHang> getAllKhachHangLa();
    @Query("SELECT u FROM KhachHang u WHERE u.Phone = ?1")
    KhachHang getKhachHangByPhone(String sdt);

//    @Modifying
//    @Query(value = "INSERT INTO KhachHang(TenKH,DiaChi,Phone,Email,isUser,IsAdmin,IsShiper) VALUES (:tenkh,:diachi,:phone,:email,'0','0','0')",nativeQuery = true)
//    void addKhachHang(@Param("name") String TenKH, @Param("diachi") String DiaChi, @Param("phone") String Phone, @Param("email") String Email);
    @Modifying
    @Query("UPDATE KhachHang u SET u.TenKH = :name,u.Phone=:phone,u.Email=:email,u.DiaChi=:diachi WHERE u.MaKH = :id")
    void UpdateCustomerInfo(@Param("id") int MaKH, @Param("name") String TenKH, @Param("phone") String Phone, @Param("email") String Email, @Param("diachi") String DiaChi);

    @Modifying
    @Query("UPDATE KhachHang u SET u.MK = :mk WHERE u.MaKH = :id")
    void ChangePassWord(@Param("id") int MaKH, @Param("mk") String MK);

}
