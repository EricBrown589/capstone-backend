package com.randomcharacter.randomcharacter.repository;

import com.randomcharacter.randomcharacter.model.Armor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmorRepository extends JpaRepository<Armor, Long> {
    Page<Armor> findAll(Pageable pageable);
}
