package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Service.ChiTietGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChiTietGioHangControl {
    @Autowired
    private ChiTietGioHangService serv;
}
