package com.randomcharacter.randomcharacter.controller;

import com.randomcharacter.randomcharacter.model.Character;
import com.randomcharacter.randomcharacter.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    private CharacterService characterService;

    @Autowired
    public void setCharacterService(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping("/character")
    public Character createCharacter(@RequestBody Character characterObject) {
        return characterService.createCharacter(characterObject);
    }
}
