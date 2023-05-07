package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang,Integer> {
}
