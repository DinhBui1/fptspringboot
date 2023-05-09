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
    @Column(name = "TongTien")
    int TongTien;
    @Column(name = "DiaChi")
    String DiaChi;
    @Column(name = "NgayDatHang")
    Date NgayDatHang;

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

    public DonHang(int maDH, int maGH, int tongTien, Date thoiGian, String diaChi, Date NgayDatHang, int phuongThucThanhToan, String tenNguoiNhan, String soDienThoai, String email, List<ChiTietDonHang> listChiTietSanPham, TrangThai trangThai, KhachHang khachHang) {
        MaDH = maDH;

        TongTien = tongTien;

        DiaChi = diaChi;
        NgayDatHang = NgayDatHang;


        this.trangThai = trangThai;
        this.khachHang = khachHang;
    }

    public int getMaDH() {
        return MaDH;
    }



    public int getTongTien() {
        return TongTien;
    }


    public String getDiaChi() {
        return DiaChi;
    }

    public Date getNgayDatHang() {
        return NgayDatHang;
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


    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }


    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void setNgayDatHang(Date NgayDatHang) {
        NgayDatHang = NgayDatHang;
    }




    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }


}
