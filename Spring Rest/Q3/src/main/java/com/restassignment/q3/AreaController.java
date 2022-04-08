package com.restassignment.q3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AreaController {

    @GetMapping("/area")
    public String first(Model model) {
        model.addAttribute("message","Enter Zipcode");
        return "ziplist";
    }
}
