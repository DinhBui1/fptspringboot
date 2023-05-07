package com.example.fptsprinboot.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "GioHang")
public class GioHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaGH")
    int MaGH;

    @OneToOne
    @JoinColumn(name = "MaKH")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "gioHang")
    private List<ChiTietGioHang> chiTietGioHangs;

    @Column(name = "isdelete")
    int IsDelete;

    public GioHang() {
    }

    public GioHang(KhachHang khachHang, int isDelete) {
        this.khachHang = khachHang;
        IsDelete = isDelete;
    }

    public int getMaGH() {
        return MaGH;
    }

    public void setMaGH(int maGH) {
        MaGH = maGH;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public List<ChiTietGioHang> getChiTietGioHangs() {
        return chiTietGioHangs;
    }

    public void setChiTietGioHangs(List<ChiTietGioHang> chiTietGioHangs) {
        this.chiTietGioHangs = chiTietGioHangs;
    }

    public int getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(int isDelete) {
        IsDelete = isDelete;
    }
}
