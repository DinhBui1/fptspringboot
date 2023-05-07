package com.example.fptsprinboot.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "TrangThai")
public class TrangThai {
    @Id
    @Column(name = "MaTrangThai")
    int MaTrangThai;
    @Column(name = "TenTrangThai")
    String TenTrangThai;

    @OneToMany(mappedBy = "trangThai",cascade = CascadeType.ALL)

    private List<DonHang> ListDonHang;

    public TrangThai(int maTrangThai, String tenTrangThai, List<DonHang> listDonHang) {
        MaTrangThai = maTrangThai;
        TenTrangThai = tenTrangThai;
        ListDonHang = listDonHang;
    }

    public TrangThai() {
    }

    public void setMaTrangThai(int maTrangThai) {
        MaTrangThai = maTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        TenTrangThai = tenTrangThai;
    }

    public void setListDonHang(List<DonHang> listDonHang) {
        ListDonHang = listDonHang;
    }

    public int getMaTrangThai() {
        return MaTrangThai;
    }

    public String getTenTrangThai() {
        return TenTrangThai;
    }

    public List<DonHang> getListDonHang() {
        return ListDonHang;
    }
}
