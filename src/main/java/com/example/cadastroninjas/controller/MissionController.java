package com.example.cadastroninjas.controller;

import com.example.cadastroninjas.entity.Mission;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class MissionController {


    // Create mission
    @PostMapping("/create")
    public String postMission(@RequestBody Mission mission) {
        return "mission created";
    }

    // Read mission
    @GetMapping("/read")
    public List<Mission> readMission() {
        List<Mission> missions = new ArrayList<Mission>();
        return missions;
    }

    // Update mission
    @PutMapping("/update")
    public String updateMission(@RequestBody Mission mission) {
        return "mission updated";
    }

    // Delete mission
    @DeleteMapping
    public String deleteMission(@RequestBody Mission mission) {
        return "mission deleted";
    }
}
