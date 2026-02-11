package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public class PlateArmor implements Armor{
    private String name;
    private int protection;
    private String armorType;
    private String effect;

    public PlateArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Heavy Armor";
        this.effect = "Thorns";
    }

    public int getProtection() {
        return protection;
    }

    public String getArmorInfo() {
        return "Plate armor - heavy armor crafted from solid steel plates";
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
