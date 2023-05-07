package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KhachHangControl {

    @Autowired
    private KhachHangService serv;


}
