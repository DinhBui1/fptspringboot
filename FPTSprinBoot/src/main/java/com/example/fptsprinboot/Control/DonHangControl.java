package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonHangControl {
    @Autowired
    private DonHangService serv;

}
