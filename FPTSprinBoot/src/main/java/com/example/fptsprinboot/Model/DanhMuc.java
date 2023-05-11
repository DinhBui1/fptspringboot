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


    @Column(name = "TenDM")
    String TenDM;

    @Column(name = "Anhdm")
    String anhdm;
    @OneToMany(mappedBy = "danhMuc",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SanPham> ListSanPham;

    public void setMaDM(int maDM) {
        MaDM = maDM;
    }


    public void setTenDM(String tenDM) {
        TenDM = tenDM;
    }

    public int getMaDM() {
        return MaDM;
    }

    public String getTenDM() {
        return TenDM;
    }

    public DanhMuc() {
    }

    public DanhMuc(int maDM, String tenDM) {
        MaDM = maDM;

        TenDM = tenDM;
    }
}
