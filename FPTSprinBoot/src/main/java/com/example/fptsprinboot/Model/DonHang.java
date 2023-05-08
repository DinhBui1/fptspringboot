package com.example.fptsprinboot.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "DonHang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDH")
    int MaDH;

    @Column(name = "MaGH")
    int MaGH;
    @Column(name = "TongTien")
    int TongTien;
    @Column(name = "ThonGian")
    Date ThoiGian;

    @Column(name = "DiaChi")
    String DiaChi;
    @Column(name = "NgayNhanHang")
    Date NgayNhanHang;
    @Column(name = "PhuongThucThanhToan")
    int PhuongThucThanhToan;
    @Column(name = "TenNguoiNhan")
    String TenNguoiNhan;
    @Column(name = "SoDienThoai")
    String SoDienThoai;
    @Column(name = "Email")
    String Email;

    @OneToMany(mappedBy = "donHang",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ChiTietDonHang> ListChiTietDonHang;

    @ManyToOne
    @JoinColumn(name = "MaTrangThai",nullable = false,referencedColumnName = "MaTrangThai")
    private TrangThai trangThai;

    @ManyToOne
    @JoinColumn(name = "MaKH",nullable = false,referencedColumnName = "MaKH")
    private KhachHang khachHang;

    public DonHang() {
    }

    public DonHang(int maDH, int maGH, int tongTien, Date thoiGian, String diaChi, Date ngayNhanHang, int phuongThucThanhToan, String tenNguoiNhan, String soDienThoai, String email, List<ChiTietDonHang> listChiTietSanPham, TrangThai trangThai, KhachHang khachHang) {
        MaDH = maDH;
        MaGH = maGH;
        TongTien = tongTien;
        ThoiGian = thoiGian;
        DiaChi = diaChi;
        NgayNhanHang = ngayNhanHang;
        PhuongThucThanhToan = phuongThucThanhToan;
        TenNguoiNhan = tenNguoiNhan;
        SoDienThoai = soDienThoai;
        Email = email;

        this.trangThai = trangThai;
        this.khachHang = khachHang;
    }

    public int getMaDH() {
        return MaDH;
    }

    public int getMaGH() {
        return MaGH;
    }

    public int getTongTien() {
        return TongTien;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public Date getNgayNhanHang() {
        return NgayNhanHang;
    }

    public int getPhuongThucThanhToan() {
        return PhuongThucThanhToan;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }



    public TrangThai getTrangThai() {
        return trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setMaDH(int maDH) {
        MaDH = maDH;
    }

    public void setMaGH(int maGH) {
        MaGH = maGH;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void setNgayNhanHang(Date ngayNhanHang) {
        NgayNhanHang = ngayNhanHang;
    }

    public void setPhuongThucThanhToan(int phuongThucThanhToan) {
        PhuongThucThanhToan = phuongThucThanhToan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        TenNguoiNhan = tenNguoiNhan;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public void setEmail(String email) {
        Email = email;
    }



    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "MaDH=" + MaDH +
                ", MaGH=" + MaGH +
                ", TongTien=" + TongTien +
                ", ThoiGian=" + ThoiGian +
                ", DiaChi='" + DiaChi + '\'' +
                ", NgayNhanHang=" + NgayNhanHang +
                ", PhuongThucThanhToan=" + PhuongThucThanhToan +
                ", TenNguoiNhan='" + TenNguoiNhan + '\'' +
                ", SoDienThoai='" + SoDienThoai + '\'' +
                ", Email='" + Email + '\'' +

                ", trangThai=" + trangThai +
                ", khachHang=" + khachHang +
                '}';
    }
}
