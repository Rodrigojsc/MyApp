package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/myapp")
    public String myApp() {
        return "Primeiro deploy! Dupla: Rodrigo e Gustavo V";
    }
}