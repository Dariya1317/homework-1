package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class WizardRobe implements Armor {
    
    private String name;
    private int protection;
    private String armorType;
    private String effect;

    public WizardRobe(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Light Armor";
        this.effect = "Mana Boost";
    }

    public int getProtection() {
        return protection;
    }

    public String getArmorInfo() {
        return "Wizard robe - a light robe with magical enchantments";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Protection: " + protection);
        System.out.println("Type: " + armorType);
        System.out.println("Effect: " + effect);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public String getEffect() {
        return effect;
    }

    @Override
    public int getDefense() {
        return protection;
    }
    
}
