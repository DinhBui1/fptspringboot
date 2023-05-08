package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnore
    private List<DanhMuc> listDanhMuc;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String tenLoai) {
        TenLoai = tenLoai;
    }

    public LoaiSanPham(int maLoai, String tenLoai) {
        MaLoai = maLoai;
        TenLoai = tenLoai;

    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "MaLoai=" + MaLoai +
                ", TenLoai='" + TenLoai + '\'' +

                '}';
    }

    public void setMaLoai(int maLoai) {
        MaLoai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }


    public int getMaLoai() {
        return MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }


}
