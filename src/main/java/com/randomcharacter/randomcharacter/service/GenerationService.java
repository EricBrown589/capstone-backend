package com.randomcharacter.randomcharacter.service;

import com.randomcharacter.randomcharacter.model.Race;
import com.randomcharacter.randomcharacter.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class GenerationService {

    private RaceRepository raceRepository;

    @Autowired
    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
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
}
