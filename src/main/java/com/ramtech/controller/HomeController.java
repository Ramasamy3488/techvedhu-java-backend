package com.ramtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "TechVedhu Backend Running Successfully 🚀";
    }
}
