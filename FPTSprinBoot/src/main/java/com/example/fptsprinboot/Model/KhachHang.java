package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private int maKH;
    @Column(name = "TenKH")
    private String tenKH;
    @Column(name = "TenTK")
    private String tenTK;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "MK")
    private String mK;
    @Column(name = "IsUser")
    private int isUser;
    @Column(name = "IsAdmin")
    private int isAdmin;


    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DonHang> listDonHang;

    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DanhGia> listDanhGia;

    @OneToOne(mappedBy = "khachHang")
    @JsonIgnore
   private GioHang gioHang;

    public KhachHang() {
    }

    public KhachHang(String tenKH, String email, String phone, String diaChi, int isUser, int isAdmin) {
        this.tenKH = tenKH;
        this.email = email;
        this.phone = phone;
        this.diaChi = diaChi;
        this.isUser = isUser;
        this.isAdmin = isAdmin;
    }

    public List<DanhGia> getListDanhGia() {
        return listDanhGia;
    }

    public void setListDanhGia(List<DanhGia> listDanhGia) {
        this.listDanhGia = listDanhGia;
    }

    public KhachHang(int maKH, String tenKH, String tenTK, String email, String phone, String diaChi, String MK, String NNMK, int isVeify, int isUser, int isAdmin, int isShiper, List<DonHang> listDonHang) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tenTK = tenTK;
        this.email = email;
        this.phone = phone;
        this.diaChi = diaChi;
        this.mK = MK;
        this.isUser = isUser;
        this.isAdmin = isAdmin;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getmK() {
        return mK;
    }

    public void setmK(String mK) {
        this.mK = mK;
    }

    public int getIsUser() {
        return isUser;
    }

    public void setIsUser(int isUser) {
        this.isUser = isUser;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<DonHang> getListDonHang() {
        return listDonHang;
    }

    public void setListDonHang(List<DonHang> listDonHang) {
        this.listDonHang = listDonHang;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH=" + maKH +
                ", tenKH='" + tenKH + '\'' +
                ", tenTK='" + tenTK + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mK='" + mK + '\'' +
                ", isUser=" + isUser +
                ", isAdmin=" + isAdmin +
                ", listDonHang=" + listDonHang +
                ", gioHang=" + gioHang +
                '}';
    }
}
