package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhGiaRepository extends JpaRepository<DanhGia,Integer> {
    @Query("SELECT u FROM DanhGia u WHERE u.sanPham.maSP=?1")
    List<DanhGia> getallDanhGiaByMaSP(int masp);

    @Query("SELECT u FROM DanhGia u WHERE u.khachHang.maKH=?1")
    List<DanhGia> getallDanhGiaByMaKH(int makh);

    @Query("SELECT u FROM DanhGia u WHERE u.maDG=?1")
    DanhGia getDanhGiaByMaDG(int madg);
}
