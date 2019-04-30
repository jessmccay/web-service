package com.example.artifactidwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String respond() {
        return "Yes! You've set up continous integragtion!";
    }
}
