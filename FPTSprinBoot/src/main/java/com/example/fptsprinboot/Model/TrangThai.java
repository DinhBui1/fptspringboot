package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "TrangThai")
public class TrangThai {
    @Id
    @Column(name = "MaTrangThai")
    int maTrangThai;
    @Column(name = "TenTrangThai")
    String tenTrangThai;

    @OneToMany(mappedBy = "trangThai",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DonHang> listDonHang;

    public TrangThai(int maTrangThai, String tenTrangThai, List<DonHang> listDonHang) {
        this.maTrangThai = maTrangThai;
        this.tenTrangThai = tenTrangThai;
    }

    public TrangThai() {
    }

    public int getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(int maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

    public List<DonHang> getListDonHang() {
        return listDonHang;
    }

    public void setListDonHang(List<DonHang> listDonHang) {
        this.listDonHang = listDonHang;
    }
}
