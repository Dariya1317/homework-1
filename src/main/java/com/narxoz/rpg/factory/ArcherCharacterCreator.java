package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;

public class ArcherCharacterCreator extends CharacterCreator{
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
    
}
