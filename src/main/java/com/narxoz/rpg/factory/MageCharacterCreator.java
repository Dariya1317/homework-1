package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;

public class MageCharacterCreator extends CharacterCreator{
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
