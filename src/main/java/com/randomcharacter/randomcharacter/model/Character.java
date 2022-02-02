package com.randomcharacter.randomcharacter.model;

import javax.persistence.*;

@Entity
@Table(name = "character")
public class Character {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(orphanRemoval = false)
    @JoinColumn(name = "race_id", referencedColumnName = "id")
    private Race race;

    @OneToOne(orphanRemoval = false)
    @JoinColumn(name = "armor_id", referencedColumnName = "id")
    private Armor armor;

    @OneToOne(orphanRemoval = false)
    @JoinColumn(name = "weapon_id", referencedColumnName = "id")
    private Weapon weapon;

    @OneToOne(orphanRemoval = false)
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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
