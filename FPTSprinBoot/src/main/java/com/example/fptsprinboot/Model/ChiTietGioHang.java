package com.example.fptsprinboot.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ChiTietGioHang")
public class ChiTietGioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCTGH")
    int MaCTGH;

    @ManyToOne
    @JoinColumn(name = "MaGH")
    private GioHang gioHang;

    @Column(name = "MaSP")
    int MaSP;

    @Column(name = "SoLuong")
    int SoLuong;

    @Column(name = "isdelete")
    int IdDelete;

    public ChiTietGioHang() {
    }

    public ChiTietGioHang(GioHang gioHang, int maSP, int soLuong, int idDelete) {
        this.gioHang = gioHang;
        MaSP = maSP;
        SoLuong = soLuong;
        IdDelete = idDelete;
    }

    public int getIdDelete() {
        return IdDelete;
    }

    public void setIdDelete(int idDelete) {
        IdDelete = idDelete;
    }

    public int getMaCTGH() {
        return MaCTGH;
    }

    public void setMaCTGH(int maCTGH) {
        MaCTGH = maCTGH;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
}
