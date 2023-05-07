package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.AnhSanPham;
import com.example.fptsprinboot.Model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnhSanPhamRepository extends JpaRepository<AnhSanPham,Integer> {
    @Query("SELECT u FROM AnhSanPham u WHERE u.sanPham1= ?1")
    AnhSanPham getAnhSPByID(int id);
}
