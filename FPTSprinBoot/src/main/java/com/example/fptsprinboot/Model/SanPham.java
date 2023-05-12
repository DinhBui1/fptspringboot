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
    int maSP;

    @ManyToOne
    @JoinColumn(name = "MaDM",nullable = false,referencedColumnName = "MaDM")

    private DanhMuc danhMuc;

    @Column(name = "TenSP")
    String tenSP;
    @Column(name = "MoTa")
    String moTa;
    @Column(name = "GiaGoc")
    int giaGoc;
    @Column(name = "GiaBanThuong")
    int giaBanThuong;
    @Column(name = "GiaKhuyenMai")
    int giaKhuyenMai;
    @Column(name = "SoLuong")
    int soLuong;
    @Column(name = "Anh")
    String anh;
    @Column(name = "MoTaNgan")
    String moTaNgan;
    @Column(name = "isDeleted")
    int isDeteted;

    @OneToMany(mappedBy = "sanPham1",cascade = CascadeType.ALL)

    private List<AnhSanPham> listAnhSanPham;

    @OneToMany(mappedBy = "sanPham2",cascade = CascadeType.ALL)
    @JsonIgnore
    private  List<ChiTietDonHang> listCTDH;

    public SanPham() {
    }

    public SanPham(int maSP, DanhMuc danhMuc, String tenSP, String moTa, int giaGoc, int giaBanThuong, int giaKhuyenMai, int soLuong, String anh, String moTaNgan, int isDeteted, List<AnhSanPham> listAnhSanPham, List<ChiTietDonHang> listCTDH) {
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.giaGoc = giaGoc;
        this.giaBanThuong = giaBanThuong;
        this.giaKhuyenMai = giaKhuyenMai;
        this.soLuong = soLuong;
        this.anh = anh;
        this.moTaNgan = moTaNgan;
        this.isDeteted = isDeteted;
        this.listAnhSanPham = listAnhSanPham;
        this.listCTDH = listCTDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(int giaGoc) {
        this.giaGoc = giaGoc;
    }

    public int getGiaBanThuong() {
        return giaBanThuong;
    }

    public void setGiaBanThuong(int giaBanThuong) {
        this.giaBanThuong = giaBanThuong;
    }

    public int getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(int giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getMoTaNgan() {
        return moTaNgan;
    }

    public void setMoTaNgan(String moTaNgan) {
        this.moTaNgan = moTaNgan;
    }

    public int getIsDeteted() {
        return isDeteted;
    }

    public void setIsDeteted(int isDeteted) {
        this.isDeteted = isDeteted;
    }

    public List<AnhSanPham> getListAnhSanPham() {
        return listAnhSanPham;
    }

    public void setListAnhSanPham(List<AnhSanPham> listAnhSanPham) {
        this.listAnhSanPham = listAnhSanPham;
    }

    public List<ChiTietDonHang> getListCTDH() {
        return listCTDH;
    }

    public void setListCTDH(List<ChiTietDonHang> listCTDH) {
        this.listCTDH = listCTDH;
    }

}
