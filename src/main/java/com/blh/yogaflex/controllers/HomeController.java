package com.blh.yogaflex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String getHome(){
        return "index";
    }

    @GetMapping("/about")
    String getAbout(){
        return "about";
    }

    @GetMapping("/contact")
    String getContact(){
        return "contact";
    }
}
