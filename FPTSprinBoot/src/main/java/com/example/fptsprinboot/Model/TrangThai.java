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
    int MaTrangThai;
    @Column(name = "TenTrangThai")
    String TenTrangThai;

    @OneToMany(mappedBy = "trangThai",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DonHang> ListDonHang;

    public TrangThai(int maTrangThai, String tenTrangThai, List<DonHang> listDonHang) {
        MaTrangThai = maTrangThai;
        TenTrangThai = tenTrangThai;

    }

    public TrangThai() {
    }

    public void setMaTrangThai(int maTrangThai) {
        MaTrangThai = maTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        TenTrangThai = tenTrangThai;
    }



    public int getMaTrangThai() {
        return MaTrangThai;
    }

    public String getTenTrangThai() {
        return TenTrangThai;
    }


}
