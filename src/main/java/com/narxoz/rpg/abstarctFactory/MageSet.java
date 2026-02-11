package com.narxoz.rpg.abstarctFactory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.magic.Staff;
import com.narxoz.rpg.equipment.magic.WizardRobe;

public class MageSet implements SetFactory {
    @Override
    public Weapon createWeapon(String name, int damage) {
        return new Staff(name, damage); 
    }

    @Override
    public Armor createArmor(String name, int protection) {
        return new WizardRobe(name, protection);
    }
}
