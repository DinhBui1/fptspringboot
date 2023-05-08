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
    private int MaCTDH;

    @ManyToOne
    @JoinColumn(name = "MaSP",nullable = false,referencedColumnName = "MaSP")

    private SanPham sanPham2;


    @ManyToOne()
    @JoinColumn(name = "MaDH")

    private DonHang donHang;

    @Column(name = "SoLuong")
    int SoLuong;
    @Column(name = "TongTien")
    int TongTien;



    @Override
    public String toString() {
        return "ChiTietDonHang{" +
                "sanPham2=" + sanPham2 +
                ", SoLuong=" + SoLuong +
                ", TongTien=" + TongTien +
                ", donHang=" + donHang +
                '}';
    }

    public void setSanPham2(SanPham sanPham2) {
        this.sanPham2 = sanPham2;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public SanPham getSanPham2() {
        return sanPham2;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getTongTien() {
        return TongTien;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(SanPham sanPham2, int soLuong, int tongTien, DonHang donHang) {
        this.sanPham2 = sanPham2;
        SoLuong = soLuong;
        TongTien = tongTien;
        this.donHang = donHang;
    }
}
