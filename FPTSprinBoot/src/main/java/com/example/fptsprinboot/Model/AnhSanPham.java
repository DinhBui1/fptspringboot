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
    int MaAnhSP;
    @ManyToOne
    @JoinColumn(name = "MaSP",nullable = false,referencedColumnName = "MaSP")


    private SanPham sanPham1;
    @Column(name = "Anh")
    String Anh;

    public AnhSanPham(int sanPham1, String anh) {
        sanPham1 = sanPham1;
        Anh = anh;
    }

    @Override
    public String toString() {
        return "AnhSanPham{" +
                "MaAnhSP=" + MaAnhSP +
                ", sanPham1=" + sanPham1 +
                ", Anh='" + Anh + '\'' +
                '}';
    }

    public void setMaAnhSP(int maAnhSP) {
        MaAnhSP = maAnhSP;
    }

    public void setSanPham1(SanPham sanPham1) {
        this.sanPham1 = sanPham1;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public int getMaAnhSP() {
        return MaAnhSP;
    }

    public SanPham getSanPham1() {
        return sanPham1;
    }

    public String getAnh() {
        return Anh;
    }

    public AnhSanPham() {
    }

    public AnhSanPham(int maAnhSP, SanPham sanPham1, String anh) {
        MaAnhSP = maAnhSP;
        this.sanPham1 = sanPham1;
        Anh = anh;
    }
}
