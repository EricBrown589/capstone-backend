package com.randomcharacter.randomcharacter.model;

import javax.persistence.*;

@Entity
@Table(name = "character")
public class Character {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "race_id", referencedColumnName = "id")
    private Race race;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "armor_id", referencedColumnName = "id")
    private Armor armor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_id", referencedColumnName = "id")
    private Weapon weapon;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attribute_id", referencedColumnName = "id")
    private Attribute attribute;

    public Character() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
