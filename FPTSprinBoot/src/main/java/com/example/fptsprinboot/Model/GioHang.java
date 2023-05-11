package com.example.fptsprinboot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    int maGH;

    @OneToOne
    @JoinColumn(name = "MaKH")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "gioHang")
    @JsonIgnore
    private List<ChiTietGioHang> chiTietGioHangs;

    @Column(name = "isdelete")
    int isDelete;

    public GioHang() {
    }

    public GioHang(KhachHang khachHang, int isDelete) {
        this.khachHang = khachHang;
        this.isDelete = isDelete;
    }

    public int getMaGH() {
        return maGH;
    }

    public void setMaGH(int maGH) {
        this.maGH = maGH;
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
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "GioHang{" +
                "maGH=" + maGH +
                ", khachHang=" + khachHang +
                ", chiTietGioHangs=" + chiTietGioHangs +
                ", isDelete=" + isDelete +
                '}';
    }
}
