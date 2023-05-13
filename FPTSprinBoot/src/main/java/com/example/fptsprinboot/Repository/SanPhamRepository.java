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
    @Query("SELECT u FROM SanPham u WHERE u.danhMuc.maDM= ?1")
    List<SanPham> getSanPhamByMaDM(int MaDM);

    @Query("SELECT u FROM SanPham u WHERE u.maSP= ?1")
    SanPham getSanPhamByMaSP(int MaSP);
    @Modifying
    @Query("UPDATE SanPham u SET u.danhMuc = :madm,u.tenSP=:tensp,u.moTa=:mota,u.giaGoc=:giagoc,u.giaBanThuong=:giabanthuong,u.giaKhuyenMai=:giakhuyenmai,u.soLuong=:soluong,u.anh=:anh,u.moTaNgan=:motangan WHERE u.maSP = :id")
    void UpdateCustomerInfo(@Param("id") int MaSP,@Param("madm") int MaDM, @Param("mota") String MoTa, @Param("tensp") String TenSP,  @Param("giagoc") int GiaGoc,@Param("giabanthuong") int GiaBanThuong,@Param("giakhuyenmai") int GiaKhuyenMai,@Param("soluong") int SoLuong, @Param("anh") String Anh, @Param("motangan") String MoTaNgan);

}
