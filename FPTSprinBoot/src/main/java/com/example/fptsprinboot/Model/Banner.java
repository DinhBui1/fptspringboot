package com.example.fptsprinboot.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaB")
    private  int MaB;
    @Column(name = "TieuDeB")
    private  String TieuDeB;
    @Column(name = "Anh")
    private  String Anh;

}
