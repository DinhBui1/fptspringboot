package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
}
