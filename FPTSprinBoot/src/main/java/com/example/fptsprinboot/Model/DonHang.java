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
    int maDH;
    @Column(name = "TongTien")
    int tongTien;
    @Column(name = "DiaChi")
    String diaChi;
    @Column(name = "NgayDatHang")
    Date ngayDatHang;

    @OneToMany(mappedBy = "donHang",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ChiTietDonHang> listChiTietDonHang;

    @ManyToOne
    @JoinColumn(name = "MaTrangThai",nullable = false,referencedColumnName = "MaTrangThai")
    private TrangThai trangThai;

    @ManyToOne
    @JoinColumn(name = "MaKH",nullable = false,referencedColumnName = "MaKH")
    private KhachHang khachHang;

    public DonHang() {
    }

    public DonHang(int maDH, int maGH, int tongTien, Date thoiGian, String diaChi, Date NgayDatHang, int phuongThucThanhToan, String tenNguoiNhan, String soDienThoai, String email, List<ChiTietDonHang> listChiTietSanPham, TrangThai trangThai, KhachHang khachHang) {
        this.maDH = maDH;

        this.tongTien = tongTien;

        this.diaChi = diaChi;
        this.ngayDatHang = NgayDatHang;


        this.trangThai = trangThai;
        this.khachHang = khachHang;
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public List<ChiTietDonHang> getListChiTietDonHang() {
        return listChiTietDonHang;
    }

    public void setListChiTietDonHang(List<ChiTietDonHang> listChiTietDonHang) {
        this.listChiTietDonHang = listChiTietDonHang;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "maDH=" + maDH +
                ", tongTien=" + tongTien +
                ", diaChi='" + diaChi + '\'' +
                ", ngayDatHang=" + ngayDatHang +
                ", listChiTietDonHang=" + listChiTietDonHang +
                ", trangThai=" + trangThai +
                ", khachHang=" + khachHang +
                '}';
    }
}
