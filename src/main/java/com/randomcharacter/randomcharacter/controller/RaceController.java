package com.randomcharacter.randomcharacter.controller;

import com.randomcharacter.randomcharacter.model.Race;
import com.randomcharacter.randomcharacter.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaceController {

    private RaceService raceService;

    @Autowired
    public void setRaceService(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/race")
    public Race getRandomRace() {
        return raceService.getRandomRace();
    }
}
