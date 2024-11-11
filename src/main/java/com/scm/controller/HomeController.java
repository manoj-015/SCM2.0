package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
    @RequestMapping("/")
    public String homeController(Model model){
        model.addAttribute("name", "Test");
        model.addAttribute("link", "https://mail.google.com/mail/u/0/#inbox");
        return "home";
    }

}
