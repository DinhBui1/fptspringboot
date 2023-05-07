package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham,Integer> {
    @Query("SELECT u FROM SanPham u WHERE u.danhMuc= ?1")
    List<SanPham> getSanPhamByMaDM(int MaDM);

    @Query("SELECT u FROM SanPham u WHERE u.MaSP= ?1")
    SanPham getSanPhamByMaSP(int MaSP);
    @Modifying
    @Query("UPDATE SanPham u SET u.danhMuc = :madm,u.TenSP=:tensp,u.MoTa=:mota,u.GiaGoc=:giagoc,u.GiaBanThuong=:giabanthuong,u.GiaKhuyenMai=:giakhuyenmai,u.SoLuong=:soluong,u.Anh=:anh,u.MoTaNgan=:motangan WHERE u.MaSP = :id")
    void UpdateCustomerInfo(@Param("id") int MaSP,@Param("madm") int MaDM, @Param("mota") String MoTa, @Param("tensp") String TenSP,  @Param("giagoc") int GiaGoc,@Param("giabanthuong") int GiaBanThuong,@Param("giakhuyenmai") int GiaKhuyenMai,@Param("soluong") int SoLuong, @Param("anh") String Anh, @Param("motangan") String MoTaNgan);

}
