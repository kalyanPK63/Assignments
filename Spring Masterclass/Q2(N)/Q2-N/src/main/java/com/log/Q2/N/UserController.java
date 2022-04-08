package com.log.Q2.N;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String first(Model model){
        model.addAttribute("message","Please Enter Login Details");
        return "login";
    }

    @PostMapping("/submit")
    public String userValidation(Model model, @ModelAttribute("User") User user){
        if(user.getEmail().equals("mk6995@srmist.edu.in") && user.getPassword().equals("NoPassword")){
            user.setUsername("Pavan_63");
            model.addAttribute("msg", "Welcome "+user.getUsername());
            return "success";
        }
        else{
            model.addAttribute("errorMessage","Invalid Email or Password");
            return "error";
        }

    }
}
