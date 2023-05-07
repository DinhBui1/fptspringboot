package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChiTietDonHangControl {
    @Autowired
    private ChiTietDonHangService serv;

}
