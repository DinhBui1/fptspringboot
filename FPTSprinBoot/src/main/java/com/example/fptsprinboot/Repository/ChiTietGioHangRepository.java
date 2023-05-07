package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.ChiTietGioHang;
import com.example.fptsprinboot.Model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietGioHangRepository extends JpaRepository<ChiTietGioHang,Integer> {
    @Query("SELECT u FROM ChiTietGioHang u WHERE (u.gioHang = ?1)")
    List<ChiTietGioHang> getAllChiTietGioHangByID(int MaGH);

}
