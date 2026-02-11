package com.narxoz.rpg;

import com.narxoz.rpg.abstarctFactory.ArcherSet;
import com.narxoz.rpg.abstarctFactory.MageSet;
import com.narxoz.rpg.abstarctFactory.SetFactory;
import com.narxoz.rpg.abstarctFactory.WarriorSet;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.CharactersTypes;
import com.narxoz.rpg.factory.CharacterCreatorRegistry;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");
        CharacterCreatorRegistry registry = new CharacterCreatorRegistry();
        Character warrior = registry.getCreator(CharactersTypes.WARRIOR).prepareCharacter("Harry Potter");
        Character mage = registry.getCreator(CharactersTypes.MAGE).prepareCharacter("Hermione Granger");
        Character archer = registry.getCreator(CharactersTypes.ARCHER).prepareCharacter("Ginny Weasley");

        System.out.println(" ");
        SetFactory warriorFactory = new WarriorSet();
        SetFactory mageFactory = new MageSet();
        SetFactory archerFactory = new ArcherSet();
        warrior.equipWeapon(warriorFactory.createWeapon("Sword of Gryffindor", 80));
        warrior.equipArmor(warriorFactory.createArmor("Hogwarts Battle Armor", 110));

        mage.equipWeapon(mageFactory.createWeapon("Elder Wand Replica", 95));
        mage.equipArmor(mageFactory.createArmor("Enchanted Hogwarts Robe", 85));

        archer.equipWeapon(archerFactory.createWeapon("Phoenix Feather Bow", 70));
        archer.equipArmor(archerFactory.createArmor("Quidditch Leather Gear", 60));

        System.out.println(" ");

        warrior.displayStats();
        warrior.displayEquipment();
        System.out.println();

        mage.displayStats();
        mage.displayEquipment();
        System.out.println();

        archer.displayStats();
        archer.displayEquipment();

        System.out.println("\n=== Demo Complete ===");
    }

   
}
