package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import com.example.fptsprinboot.Model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang,Integer> {

    @Query("SELECT u FROM  ChiTietDonHang u WHERE u.maCTDH=?1")
    ChiTietDonHang getChiTietDonHangByID(int id);

    @Query("SELECT u FROM  ChiTietDonHang u WHERE u.donHang.maDH=?1")
    List<ChiTietDonHang> getChiTietDonHangByMaDH(int id);
}
