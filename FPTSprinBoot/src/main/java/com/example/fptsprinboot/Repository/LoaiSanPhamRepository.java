package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham,Integer> {
}
