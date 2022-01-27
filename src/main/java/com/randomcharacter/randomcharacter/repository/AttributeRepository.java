package com.randomcharacter.randomcharacter.repository;

import com.randomcharacter.randomcharacter.model.Attribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepository extends JpaRepository<Attribute, Long> {
    Page<Attribute> findAll(Pageable pageable);
}
