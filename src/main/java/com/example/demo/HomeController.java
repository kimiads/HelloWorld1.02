package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("myvar", "Say hello to the people.");
        return "hometemplate";}

        @RequestMapping("/next")
    public String nextpage(Model model){
        model.addAttribute("myvar2", "The high temperature is 90 degrees.");
        return "nextpage";
        }
}


