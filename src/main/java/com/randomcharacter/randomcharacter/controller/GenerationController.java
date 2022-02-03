package com.randomcharacter.randomcharacter.controller;

import com.randomcharacter.randomcharacter.model.Armor;
import com.randomcharacter.randomcharacter.model.Attribute;
import com.randomcharacter.randomcharacter.model.Race;
import com.randomcharacter.randomcharacter.model.Weapon;
import com.randomcharacter.randomcharacter.service.GenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://random-character.herokuapp.com")
public class GenerationController {

    private GenerationService generationService;

    @Autowired
    public void setGenerationService(GenerationService generationService) {
        this.generationService = generationService;
    }

    @GetMapping("/race")
    public Race getRandomRace() {
        return generationService.getRandomRace();
    }

    @GetMapping("/armor")
    public Armor getRandomArmor() {
        return generationService.getRandomArmor();
    }

    @GetMapping("/weapon")
    public Weapon getRandomWeapon() {
        return generationService.getRandomWeapon();
    }

    @GetMapping("/attribute")
    public Attribute getRandomAttribute() {
        return generationService.getRandomAttribute();
    }
}
