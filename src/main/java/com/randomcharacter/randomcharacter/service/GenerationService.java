package com.randomcharacter.randomcharacter.service;

import com.randomcharacter.randomcharacter.model.Armor;
import com.randomcharacter.randomcharacter.model.Attribute;
import com.randomcharacter.randomcharacter.model.Race;
import com.randomcharacter.randomcharacter.model.Weapon;
import com.randomcharacter.randomcharacter.repository.ArmorRepository;
import com.randomcharacter.randomcharacter.repository.AttributeRepository;
import com.randomcharacter.randomcharacter.repository.RaceRepository;
import com.randomcharacter.randomcharacter.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class GenerationService {

    private RaceRepository raceRepository;
    private ArmorRepository armorRepository;
    private AttributeRepository attributeRepository;
    private WeaponRepository weaponRepository;

    @Autowired
    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }
    @Autowired
    public void setArmorRepository(ArmorRepository armorRepository) {
        this.armorRepository = armorRepository;
    }
    @Autowired
    public void setAttributeRepository(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }
    @Autowired
    public void setWeaponRepository(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }
    
    // Used https://stackoverflow.com/a/43054173 to figure out the random generation
    public Race getRandomRace() {
        Long qty = raceRepository.count();
        int index = (int)(Math.random() * qty);
        Page<Race> racePage = raceRepository.findAll(PageRequest.of(index, 1));
        Race r = null;
        if (racePage.hasContent()) {
            r = racePage.getContent().get(0);
        }
        return r;
    }

    public Armor getRandomArmor() {
        Long qty = armorRepository.count();
        int index = (int)(Math.random() * qty);
        Page<Armor> armorPage = armorRepository.findAll(PageRequest.of(index, 1));
        Armor a = null;
        if (armorPage.hasContent()) {
            a = armorPage.getContent().get(0);
        }
        return a;
    }

    public Weapon getRandomWeapon() {
        Long qty = weaponRepository.count();
        int index = (int)(Math.random() * qty);
        Page<Weapon> weaponPage = weaponRepository.findAll(PageRequest.of(index, 1));
        Weapon w = null;
        if (weaponPage.hasContent()) {
            w = weaponPage.getContent().get(0);
        }
        return w;
    }

    public Attribute getRandomAttribute() {
        Long qty = attributeRepository.count();
        int index = (int)(Math.random() * qty);
        Page<Attribute> attributePage = attributeRepository.findAll(PageRequest.of(index, 1));
        Attribute a = null;
        if (attributePage.hasContent()) {
            a = attributePage.getContent().get(0);
        }
        return a;
    }
}
