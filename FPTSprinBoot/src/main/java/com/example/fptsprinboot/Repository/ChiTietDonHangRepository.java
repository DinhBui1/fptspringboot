package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang,Integer> {
}
