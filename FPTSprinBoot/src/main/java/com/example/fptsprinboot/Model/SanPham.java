package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSP")
    int MaSP;

    @ManyToOne
    @JoinColumn(name = "MaDM",nullable = false,referencedColumnName = "MaDM")

    private DanhMuc danhMuc;

    @Column(name = "TenSP")
    String TenSP;
    @Column(name = "MoTa")
    String MoTa;
    @Column(name = "GiaGoc")
    int GiaGoc;
    @Column(name = "GiaBanThuong")
    int GiaBanThuong;
    @Column(name = "GiaKhuyenMai")
    int GiaKhuyenMai;
    @Column(name = "SoLuong")
    int SoLuong;
    @Column(name = "Anh")
    String Anh;
    @Column(name = "MoTaNgan")
    String MoTaNgan;
    @Column(name = "isDeleted")
    int isDeteted;

    @OneToMany(mappedBy = "sanPham1",cascade = CascadeType.ALL)

    private List<AnhSanPham> ListAnhSanPham;

    @OneToMany(mappedBy = "sanPham2",cascade = CascadeType.ALL)
    @JsonIgnore
    private  List<ChiTietDonHang> ListCTDH;

    public SanPham(int danhMuc, String tenSP, String moTa, int giaGoc, int giaBanThuong, int giaKhuyenMai, int soLuong, String anh, String moTaNgan, int isDeteted) {
        danhMuc = danhMuc;
        TenSP = tenSP;
        MoTa = moTa;
        GiaGoc = giaGoc;
        GiaBanThuong = giaBanThuong;
        GiaKhuyenMai = giaKhuyenMai;
        SoLuong = soLuong;
        Anh = anh;
        MoTaNgan = moTaNgan;
        this.isDeteted = isDeteted;
    }

    public SanPham() {
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public void setGiaGoc(int giaGoc) {
        GiaGoc = giaGoc;
    }

    public void setGiaBanThuong(int giaBanThuong) {
        GiaBanThuong = giaBanThuong;
    }

    public void setGiaKhuyenMai(int giaKhuyenMai) {
        GiaKhuyenMai = giaKhuyenMai;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public void setMoTaNgan(String moTaNgan) {
        MoTaNgan = moTaNgan;
    }

    public void setIsDeteted(int isDeteted) {
        this.isDeteted = isDeteted;
    }

    public void setListAnhSanPham(List<AnhSanPham> listAnhSanPham) {
        ListAnhSanPham = listAnhSanPham;
    }



    public int getMaSP() {
        return MaSP;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public String getTenSP() {
        return TenSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public int getGiaGoc() {
        return GiaGoc;
    }

    public int getGiaBanThuong() {
        return GiaBanThuong;
    }

    public int getGiaKhuyenMai() {
        return GiaKhuyenMai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getAnh() {
        return Anh;
    }

    public String getMoTaNgan() {
        return MoTaNgan;
    }

    public int getIsDeteted() {
        return isDeteted;
    }

    public List<AnhSanPham> getListAnhSanPham() {
        return ListAnhSanPham;
    }



    public SanPham(int maSP, DanhMuc danhMuc, String tenSP, String moTa, int giaGoc, int giaBanThuong, int giaKhuyenMai, int soLuong, String anh, String moTaNgan, int isDeteted, List<AnhSanPham> listAnhSanPham, List<ChiTietDonHang> listCTDH) {
        MaSP = maSP;
        this.danhMuc = danhMuc;
        TenSP = tenSP;
        MoTa = moTa;
        GiaGoc = giaGoc;
        GiaBanThuong = giaBanThuong;
        GiaKhuyenMai = giaKhuyenMai;
        SoLuong = soLuong;
        Anh = anh;
        MoTaNgan = moTaNgan;
        this.isDeteted = isDeteted;
        ListAnhSanPham = listAnhSanPham;

    }
}
