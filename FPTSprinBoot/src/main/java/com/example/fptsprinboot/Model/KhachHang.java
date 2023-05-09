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
    public KhachHang() {
    }

    public KhachHang(String tenKH, String email, String phone, String diaChi, int isUser, int isAdmin) {
        TenKH = tenKH;
        Email = email;
        Phone = phone;
        DiaChi = diaChi;
        IsUser = isUser;
        IsAdmin = isAdmin;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private int MaKH;
    @Column(name = "TenKH")
    private String TenKH;
    @Column(name = "TenTK")
    private String TenTK;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "DiaChi")
    private String DiaChi;
    @Column(name = "MK")
    private String MK;
    @Column(name = "IsUser")
    private int IsUser;
    @Column(name = "IsAdmin")
    private int IsAdmin;


    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DonHang> ListDonHang;

    @OneToOne(mappedBy = "khachHang")
    @JsonIgnore
   private GioHang gioHang;

    public KhachHang(int maKH, String tenKH, String tenTK, String email, String phone, String diaChi, String MK, String NNMK, int isVeify, int isUser, int isAdmin, int isShiper, List<DonHang> listDonHang) {
        MaKH = maKH;
        TenKH = tenKH;
        TenTK = tenTK;
        Email = email;
        Phone = phone;
        DiaChi = diaChi;
        this.MK = MK;

        IsUser = isUser;
        IsAdmin = isAdmin;


    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public void setTenTK(String tenTK) {
        TenTK = tenTK;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }


    public void setIsUser(int isUser) {
        IsUser = isUser;
    }

    public void setIsAdmin(int isAdmin) {
        IsAdmin = isAdmin;
    }



    public int getMaKH() {
        return MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getTenTK() {
        return TenTK;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getMK() {
        return MK;
    }


    public int getIsUser() {
        return IsUser;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }


}
