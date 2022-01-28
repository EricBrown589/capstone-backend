package com.randomcharacter.randomcharacter.repository;

import com.randomcharacter.randomcharacter.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

}
