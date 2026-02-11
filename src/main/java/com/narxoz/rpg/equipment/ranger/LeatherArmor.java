package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor{
    private String name;
    private int protection;
    private String armorType;
    private String effect;

    public LeatherArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Light Armor";
        this.effect = "Stealth";
    }

    public int getProtection() {
        return protection;
    }

    public String getArmorInfo() {
        return "Leather armor - light protective gear made from leather.";
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
