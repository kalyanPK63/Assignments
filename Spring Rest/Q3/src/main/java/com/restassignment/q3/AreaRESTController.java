package com.restassignment.q3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/submit")
public class AreaRESTController {

    private final AreaRepository repository;

    public AreaRESTController(AreaRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public Area find(@ModelAttribute("Area") Area area) {
        return repository.findbyZip(area.getZipcode());
    }
}
