package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DanhMuc;
import com.example.fptsprinboot.Model.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham,Integer> {

    @Query("SELECT u FROM LoaiSanPham u ")
    List<LoaiSanPham> getLoaiSanPham();
}
