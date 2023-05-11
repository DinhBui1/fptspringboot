package com.example.fptsprinboot.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "ChiTietDonHang")
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCTDH")
    private int maCTDH;

    @ManyToOne
    @JoinColumn(name = "MaSP",nullable = false,referencedColumnName = "MaSP")
    private SanPham sanPham2;


    @ManyToOne()
    @JoinColumn(name = "MaDH")

    private DonHang donHang;

    @Column(name = "SoLuong")
    int soLuong;
    @Column(name = "TongTien")
    int tongTien;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(SanPham sanPham2, int soLuong, int tongTien, DonHang donHang) {
        this.sanPham2 = sanPham2;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.donHang = donHang;
    }

    @Override
    public String toString() {
        return "ChiTietDonHang{" +
                "maCTDH=" + maCTDH +
                ", sanPham2=" + sanPham2 +
                ", donHang=" + donHang +
                ", soLuong=" + soLuong +
                ", tongTien=" + tongTien +
                '}';
    }
}
