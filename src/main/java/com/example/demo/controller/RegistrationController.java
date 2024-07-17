package com.example.demo.controller;

import org.springframework.ui.Model;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        System.out.println("User registered:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        return "redirect:/";
    }
}
