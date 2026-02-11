package com.narxoz.rpg.abstarctFactory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.medieval.IronSword;
import com.narxoz.rpg.equipment.medieval.PlateArmor;

public class WarriorSet implements SetFactory {
     @Override
    public Weapon createWeapon(String name, int damage) {
        return new IronSword(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new PlateArmor(name, protection);
    }             
}
