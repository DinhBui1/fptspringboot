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
    int maCTGH;

    @ManyToOne
    @JoinColumn(name = "MaGH")
    private GioHang gioHang;

    @Column(name = "MaSP")
    int maSP;

    @Column(name = "SoLuong")
    int soLuong;

    @Column(name = "isdelete")
    int idDelete;

    public ChiTietGioHang() {
    }

    public ChiTietGioHang(GioHang gioHang, int maSP, int soLuong, int idDelete) {
        this.gioHang = gioHang;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.idDelete = idDelete;
    }

    public int getMaCTGH() {
        return maCTGH;
    }

    public void setMaCTGH(int maCTGH) {
        this.maCTGH = maCTGH;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(int idDelete) {
        this.idDelete = idDelete;
    }

    @Override
    public String toString() {
        return "ChiTietGioHang{" +
                "maCTGH=" + maCTGH +
                ", gioHang=" + gioHang +
                ", maSP=" + maSP +
                ", soLuong=" + soLuong +
                ", idDelete=" + idDelete +
                '}';
    }
}
