package com.zy.controller;

import com.zy.bean.Press;
import com.zy.service.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/press")
@Controller
public class PressController {

    @Autowired
    private PressService pressService;

    @RequestMapping("/findByBookId")
    public void findByBookId(){
        List<Press> presses = pressService.findByBookId(1);
        System.out.println(presses);
    }
}
