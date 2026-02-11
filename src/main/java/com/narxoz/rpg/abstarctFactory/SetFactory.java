package com.narxoz.rpg.abstarctFactory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface SetFactory {
    Weapon createWeapon(String name, int damage);
    Armor createArmor(String name, int protection);
}
