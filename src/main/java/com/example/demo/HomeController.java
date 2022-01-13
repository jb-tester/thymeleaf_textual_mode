package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("attr1","test textual mode");
        model.addAttribute("buttonColor","cadetblue");
        model.addAttribute("fontColor","blue");
        model.addAttribute("backgroundColor","azure");
        model.addAttribute("buttonFontColor","white");
        return "index";
    }
}
