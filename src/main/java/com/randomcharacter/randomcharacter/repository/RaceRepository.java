package com.randomcharacter.randomcharacter.repository;

import com.randomcharacter.randomcharacter.model.Race;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
    Page<Race> findAll(Pageable pageable);
}
