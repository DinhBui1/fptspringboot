package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang,Integer> {
    @Query("select u FROM DonHang u WHERE u.maDH=?1")
    DonHang getDonHangById(int id);

    @Query("select u FROM DonHang u WHERE u.khachHang.maKH=?1")
    List<DonHang> getDonHangByMaKh(int id);

    @Query("select sum (u.tongTien)from  DonHang u where month(u.ngayDatHang) =?1 ")
    Integer doanhthu(int thang);
}
