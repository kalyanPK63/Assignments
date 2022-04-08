package com.example.q2;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/submit")
public class UserRESTController {

    @PostMapping
    public String uservalidation(@ModelAttribute("User") User user){
        if(user.getUsername().equals("Pavan_K") && user.getPassword().equals("Ra18@322"))
            return "valid user";
        else return "invalid user";
    }
}
