package com.bolsaideas.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("titulo",
                "Mario is the Best!");
    return "index";
    }
}
