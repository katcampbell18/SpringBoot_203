package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/userform")
    public String loadFormPage(Model model) {
        model.addAttribute("user", new User());
        return "userform";
    }
    @PostMapping("/userform")
    public String loadFromPage(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "confirmuser";
        }
    }

