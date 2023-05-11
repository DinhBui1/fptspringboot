package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import com.example.fptsprinboot.Model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang,Integer> {

    @Query("SELECT u FROM  ChiTietDonHang u WHERE u.maCTDH=?1")
    ChiTietDonHang getChiTietDonHangByID(int id);
}
