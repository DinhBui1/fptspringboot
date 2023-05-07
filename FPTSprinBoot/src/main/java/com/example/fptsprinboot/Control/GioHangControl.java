package com.example.fptsprinboot.Control;

import com.example.fptsprinboot.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GioHangControl {
    @Autowired
    private GioHangService serv;

}
