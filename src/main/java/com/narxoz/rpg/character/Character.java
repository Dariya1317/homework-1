package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class Character {
    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected CharactersTypes type;

    public String getName(){
        return name;
    };
    public int getHealth(){
        return health;
    };
    public int getMana(){
        return mana;
    };
    public int getStrength(){
        return strength;
    };
    public int getIntelligence(){
        return intelligence;
    };
    public abstract void displayStats();
    public abstract void useSpecialAbility();
    public Character(String name) {
        this.name = name;
    }
    public CharactersTypes getType() {
        return type;
    }
    protected Weapon equippedWeapon;
    protected Armor equippedArmor;
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
