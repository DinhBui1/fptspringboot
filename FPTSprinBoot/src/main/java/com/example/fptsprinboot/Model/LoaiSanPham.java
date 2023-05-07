package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "LoaiSanPham")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaLoai")
    int MaLoai;
    @Column(name = "TenLoai")
    String TenLoai;


    @OneToMany(mappedBy = "loaiSanPham",cascade = CascadeType.ALL)
    private List<DanhMuc> ListDanhMuc;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String tenLoai) {
        TenLoai = tenLoai;
    }

    public LoaiSanPham(int maLoai, String tenLoai, List<DanhMuc> listDanhMuc) {
        MaLoai = maLoai;
        TenLoai = tenLoai;
        ListDanhMuc = listDanhMuc;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "MaLoai=" + MaLoai +
                ", TenLoai='" + TenLoai + '\'' +
                ", ListDanhMuc=" + ListDanhMuc +
                '}';
    }

    public void setMaLoai(int maLoai) {
        MaLoai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public void setListDanhMuc(List<DanhMuc> listDanhMuc) {
        ListDanhMuc = listDanhMuc;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public List<DanhMuc> getListDanhMuc() {
        return ListDanhMuc;
    }
}
