package com.example.cadastroninjas.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/rotapublica")
    public String rotaPublica() {
        return "essa eh a rota publica";
    }

    // Create ninja
    @PostMapping
    public String createNinja() {
        return "create ninja";
    }

    // Read ninja
    @GetMapping
    public String readNinjas() {
        return "read ninja";
    }

    // Read ninja by id
    @GetMapping
    public String readById() {
        return "read ninja by ID";
    }

    // Update ninja
    @PutMapping
    public String updateNinja() {
        return "update ninja";
    }

    // Delete ninja
    @DeleteMapping
    public String deleteNinjaById() {
        return "delete ninja by ID";
    }

}
