package com.example.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class restcontroller {

    @GetMapping("/name")
    public String getName() {
        return "José";
    }

}
