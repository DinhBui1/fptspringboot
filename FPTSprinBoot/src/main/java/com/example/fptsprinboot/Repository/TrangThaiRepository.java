package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.TrangThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrangThaiRepository extends JpaRepository<TrangThai,Integer> {
}
