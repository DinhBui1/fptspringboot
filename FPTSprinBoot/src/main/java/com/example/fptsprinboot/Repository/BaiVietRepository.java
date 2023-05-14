package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
    @Query("SELECT u FROM BaiViet u WHERE u.maBV=?1")
    BaiViet findBaiVietByid(int id);
}
