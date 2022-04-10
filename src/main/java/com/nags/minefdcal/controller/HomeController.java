package com.nags.minefdcal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/minefdcal")
    public String getCalculationhtmlPage() {
        return "minefdcal.html";
    }
}
