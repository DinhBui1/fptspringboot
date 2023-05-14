package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietGioHangRepository extends JpaRepository<ChiTietGioHang,Integer> {
    @Query("SELECT u FROM ChiTietGioHang u WHERE (u.gioHang.maGH = ?1) and u.idDelete=0")
    List<ChiTietGioHang> getAllChiTietGioHangByID(int MaGH);

    @Query("SELECT u FROM ChiTietGioHang u WHERE (u.sanPham3.maSP = ?1) and u.gioHang.maGH=?2 and  u.idDelete=0")
    ChiTietGioHang getAllChiTietGioHangByMaSP(int MaSP,int MaGH);
}
