package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DonHang;
import com.example.fptsprinboot.Model.GioHang;
import com.example.fptsprinboot.Model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang,Integer> {

    @Query("SELECT u FROM GioHang u WHERE (u.khachHang.maKH = ?1)")
    GioHang getGioHangByKhachHang(int makh);
    @Query("SELECT u FROM GioHang u WHERE (u.maGH = ?1)")
    GioHang getGioHangById(int id);
}
