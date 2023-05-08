package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc,Integer> {
    @Query("SELECT u FROM DanhMuc u WHERE u.loaiSanPham = ?1")
    List<DanhMuc> getDanhMucByMaLoai(int maLoai);

    @Query("SELECT u FROM DanhMuc u ")
    List<DanhMuc> getDanhMuc();
}
