package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterCreator {

    public abstract Character createCharacter(String name);

    public Character prepareCharacter(String name){
        Character character = createCharacter(name);

        System.out.println("Preparing character with name: " + character.getName());
        System.out.println(" ");
        return character;
    }
}

