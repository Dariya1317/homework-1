package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Weapon;

public class IronSword implements Weapon {
    
    private String name;
    private int damage;
    private String weaponType;
    private String effect;
    
    public IronSword(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.weaponType = "Sword";
        this.effect = "Bleed";
    }

    // TODO: Implement methods from Weapon interface
    // Define those methods in the Weapon interface first!

    // Example method structure:
    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Iron Sword - a strong weapon made from forged iron";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Effect: " + effect);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    // TODO: Consider adding theme-specific properties
    // For example, Medieval weapons might have:
    // - Durability
    // - Weight
    // Magic weapons might have:
    // - Mana boost
    // - Spell power
    @Override
    public String getEffect() {
        return effect;
    }

}
