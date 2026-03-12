package com.ramtech.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {
        "http://localhost:3000",
        "https://ramasamyfullstack.github.io"
})
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "TechVedhu Backend Running Successfully";
    }
}
