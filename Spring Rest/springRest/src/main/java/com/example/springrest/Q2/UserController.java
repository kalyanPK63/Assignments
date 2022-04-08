package com.example.springrest.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @PostMapping("/login")
    public String init(Model model) {
        model.addAttribute("message","Please specify Your credentials");
        return "login";
    }
}
