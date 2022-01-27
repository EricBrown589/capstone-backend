package com.randomcharacter.randomcharacter.controller;

import com.randomcharacter.randomcharacter.model.Race;
import com.randomcharacter.randomcharacter.service.GenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerationController {

    private GenerationService generationService;

    @Autowired
    public void setRaceService(GenerationService generationService) {
        this.generationService = generationService;
    }

    @GetMapping("/race")
    public Race getRandomRace() {
        return generationService.getRandomRace();
    }
}
