package com.example.fptsprinboot.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "DanhGia")
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDG")
    int maDG;

    @ManyToOne
    @JoinColumn(name = "MaSP",nullable = false,referencedColumnName = "MaSP")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "MaKH",nullable = false,referencedColumnName = "MaKH")
    private KhachHang khachHang;

    @Column(name = "NoiDung")
    String noiDung;

    @Column(name = "Vote")
    int vote;


    public DanhGia(int maDG, SanPham sanPham, KhachHang khachHang, String noiDung, int vote) {
        this.maDG = maDG;
        this.sanPham = sanPham;
        this.khachHang = khachHang;
        this.noiDung = noiDung;
        this.vote = vote;
    }

    public DanhGia() {
    }

    public int getMaDG() {
        return maDG;
    }

    public void setMaDG(int maDG) {
        this.maDG = maDG;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
