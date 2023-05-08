package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "DanhMuc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDM")
    int MaDM;
    @ManyToOne
    @JoinColumn(name = "MaLoai",nullable = false,referencedColumnName = "MaLoai")
    //@JsonIgnore
    private LoaiSanPham loaiSanPham;

    @Column(name = "TenDM")
    String TenDM;

    @OneToMany(mappedBy = "danhMuc",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SanPham> ListSanPham;

    public void setMaDM(int maDM) {
        MaDM = maDM;
    }

    public DanhMuc(int maDM, String tenDM) {
        MaDM = maDM;
        TenDM = tenDM;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public void setTenDM(String tenDM) {
        TenDM = tenDM;
    }

    public int getMaDM() {
        return MaDM;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public String getTenDM() {
        return TenDM;
    }

    public DanhMuc() {
    }

    public DanhMuc(int maDM, LoaiSanPham loaiSanPham, String tenDM) {
        MaDM = maDM;
        this.loaiSanPham = loaiSanPham;
        TenDM = tenDM;
    }
}
