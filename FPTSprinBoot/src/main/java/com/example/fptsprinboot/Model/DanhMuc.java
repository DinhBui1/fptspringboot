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
    int maDM;


    @Column(name = "TenDM")
    String tenDM;

    @Column(name = "Anhdm")
    String anhdm;
    @OneToMany(mappedBy = "danhMuc",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SanPham> listSanPham;

    public DanhMuc() {
    }

    public DanhMuc(int maDM, String tenDM) {
        this.maDM = maDM;
        this.tenDM = tenDM;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public String getAnhdm() {
        return anhdm;
    }

    public void setAnhdm(String anhdm) {
        this.anhdm = anhdm;
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(List<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }

    @Override
    public String toString() {
        return "DanhMuc{" +
                "maDM=" + maDM +
                ", tenDM='" + tenDM + '\'' +
                ", anhdm='" + anhdm + '\'' +
                ", listSanPham=" + listSanPham +
                '}';
    }
}
