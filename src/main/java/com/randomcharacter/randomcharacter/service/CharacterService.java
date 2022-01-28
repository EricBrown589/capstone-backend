package com.randomcharacter.randomcharacter.service;

import com.randomcharacter.randomcharacter.model.*;
import com.randomcharacter.randomcharacter.model.Character;
import com.randomcharacter.randomcharacter.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;
    @Autowired
    public void setCharacterRepository(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    private GenerationService generationService;
    @Autowired
    public void setGenerationService(GenerationService generationService) {
        this.generationService = generationService;
    }

    public Character createCharacter(Character characterObject) {
        Race race = generationService.getRandomRace();
        Armor armor = generationService.getRandomArmor();
        Weapon weapon = generationService.getRandomWeapon();
        Attribute attribute = generationService.getRandomAttribute();
        characterObject.setRace(race);
        characterObject.setArmor(armor);
        characterObject.setWeapon(weapon);
        characterObject.setAttribute(attribute);
        return characterRepository.save(characterObject);
    }
}
