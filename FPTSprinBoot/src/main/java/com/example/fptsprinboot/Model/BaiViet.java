package com.example.fptsprinboot.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "BaiViet")
public class BaiViet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maBV")
    private int maBV;
    @Column(name = "tieuDeBV")
    private String tieuDeBV;
    @Column(name = "noiDung")
    private String noiDung;
    @Column(name = "anh")
    private String anh;
    @Column(name = "ngayTao")
    private Date ngayTao;
    @Column(name = "ngayCapNhat")
    private Date ngayCapNhat;

    public BaiViet(int maBV, String tieuDeBV, String noiDung, String anh, Date ngayTao, Date ngayCapNhat) {
        this.maBV = maBV;
        this.tieuDeBV = tieuDeBV;
        this.noiDung = noiDung;
        this.anh = anh;
        this.ngayTao = ngayTao;
        this.ngayCapNhat = ngayCapNhat;
    }

    public BaiViet() {
    }

    public int getMaBV() {
        return maBV;
    }

    public void setMaBV(int maBV) {
        this.maBV = maBV;
    }

    public String getTieuDeBV() {
        return tieuDeBV;
    }

    public void setTieuDeBV(String tieuDeBV) {
        this.tieuDeBV = tieuDeBV;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public String toString() {
        return "BaiViet{" +
                "maBV=" + maBV +
                ", tieuDeBV='" + tieuDeBV + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", anh='" + anh + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngayCapNhat=" + ngayCapNhat +
                '}';
    }
}
