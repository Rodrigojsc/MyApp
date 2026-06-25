package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String myApp() {

        return "Segundo deploy! Dupla: Rodrigo e Gustavo V";
    }
}