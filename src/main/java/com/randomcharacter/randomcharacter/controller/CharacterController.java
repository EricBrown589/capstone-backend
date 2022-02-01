package com.randomcharacter.randomcharacter.controller;

import com.randomcharacter.randomcharacter.model.Character;
import com.randomcharacter.randomcharacter.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CharacterController {

    private CharacterService characterService;

    @Autowired
    public void setCharacterService(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping("/create-character")
    public Character createCharacter(@RequestBody Character characterObject) {
        return characterService.createCharacter(characterObject);
    }

    @GetMapping("/character")
    public List<Character> getCharacter() {
        return characterService.getCharacter();
    }
}
