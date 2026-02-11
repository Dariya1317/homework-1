package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior extends Character {
    private Weapon equippedWeapon;
    private Armor equippedArmor;    
    public Warrior(String name) {
        super(name);
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
        this.type = CharactersTypes.WARRIOR;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE, strength temporarily increased!");
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public int getMana() {
        return mana;
    }
    @Override
    public int getStrength() {
        return strength;
    }
    @Override
    public int getIntelligence() {
        return intelligence;
    }
     public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }
    public void displayEquipment() {
        System.out.println("Equipped Weapon: " + equippedWeapon.getName());
        System.out.println("Equipped Armor: " + equippedArmor.getName());
    }
}


