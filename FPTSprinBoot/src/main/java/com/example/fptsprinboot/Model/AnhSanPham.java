package com.example.fptsprinboot.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "AnhSanPham")
public class AnhSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaAnhSP")
    int maAnhSP;
    @ManyToOne
        @JoinColumn(name = "MaSP",nullable = false,referencedColumnName = "MaSP")
        private SanPham sanPham1;
    @Column(name = "Anh")
    String anh;

    public AnhSanPham(int sanPham1, String anh) {
        sanPham1 = sanPham1;
        anh = anh;
    }

    public int getMaAnhSP() {
        return maAnhSP;
    }

    public void setMaAnhSP(int maAnhSP) {
        this.maAnhSP = maAnhSP;
    }

    public SanPham getSanPham1() {
        return sanPham1;
    }

    public void setSanPham1(SanPham sanPham1) {
        this.sanPham1 = sanPham1;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public AnhSanPham() {
    }

    public AnhSanPham(int maAnhSP, SanPham sanPham1, String anh) {
        this.maAnhSP = maAnhSP;
        this.sanPham1 = sanPham1;
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "AnhSanPham{" +
                "maAnhSP=" + maAnhSP +
                ", sanPham1=" + sanPham1 +
                ", anh='" + anh + '\'' +
                '}';
    }
}
