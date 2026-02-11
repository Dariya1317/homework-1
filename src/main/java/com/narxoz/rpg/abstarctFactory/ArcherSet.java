package com.narxoz.rpg.abstarctFactory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.ranger.Bow;
import com.narxoz.rpg.equipment.ranger.LeatherArmor;

public class ArcherSet implements SetFactory {
     @Override
    public Weapon createWeapon(String name, int damage) {
        return new Bow(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new LeatherArmor(name, protection);
    }
    
}
