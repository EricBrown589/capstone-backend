package com.randomcharacter.randomcharacter.repository;

import com.randomcharacter.randomcharacter.model.Weapon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    Page<Weapon> findAll(Pageable pageable);
}
