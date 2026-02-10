package com.colak.gitopsdemo.controller;

import com.colak.gitopsdemo.model.User;
import com.colak.gitopsdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        System.out.println("Login page requested");
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        if (!userService.saveUser(user)) {
            model.addAttribute("error", "Kullanıcı adı zaten kullanımda!");
            return "register";
        }
        return "redirect:/login?success";
    }
}
