package com.narxoz.rpg.factory;

import java.util.HashMap;
import java.util.Map;

import com.narxoz.rpg.character.CharactersTypes;

public class CharacterCreatorRegistry {
    private final Map<CharactersTypes, CharacterCreator> creators = new HashMap<>();

    public CharacterCreatorRegistry() {
        creators.put(CharactersTypes.WARRIOR, new WarriorCharacterCreator());
        creators.put(CharactersTypes.MAGE, new MageCharacterCreator());
        creators.put(CharactersTypes.ARCHER, new ArcherCharacterCreator());
    }

    public CharacterCreator getCreator(CharactersTypes type) {
        return creators.get(type);
    }
    
}
