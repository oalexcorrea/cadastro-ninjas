package com.example.cadastroninjas.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/rotapublica")
    public String rotaPublica() {
        return "essa eh a rota publica";
    }

}
