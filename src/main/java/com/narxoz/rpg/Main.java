package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║   RPG Character & Equipment System                ║");
        System.out.println("║   Design Patterns: Factory Method + Abstract Factory ║");
        System.out.println("╚════════════════════════════════════════════════════╝\n");

        System.out.println("═══ PART 1: CHARACTER CREATION (Factory Method Pattern) ═══\n");
        
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();
        
        Character warrior = warriorFactory.createCharacter("Thorin");
        Character mage = mageFactory.createCharacter("Gandalf");
        Character archer = archerFactory.createCharacter("Legolas");
        
        warrior.displayStats();
        warrior.useSpecialAbility();
        System.out.println();
        
        mage.displayStats();
        mage.useSpecialAbility();
        System.out.println();
        
        archer.displayStats();
        archer.useSpecialAbility();
        System.out.println();

        System.out.println("\n═══ PART 2: EQUIPMENT CREATION (Abstract Factory Pattern) ═══\n");
        
        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();
        
        System.out.println("--- Medieval Equipment Set ---");
        Weapon ironSword = medievalFactory.createWeapon();
        Armor plateArmor = medievalFactory.createArmor();
        ironSword.displayInfo();
        plateArmor.displayInfo();
        System.out.println();
        
        System.out.println("--- Magic Equipment Set ---");
        Weapon wizardStaff = magicFactory.createWeapon();
        Armor enchantedRobes = magicFactory.createArmor();
        wizardStaff.displayInfo();
        enchantedRobes.displayInfo();
        System.out.println();
        
        System.out.println("--- Ranger Equipment Set ---");
        Weapon longbow = rangerFactory.createWeapon();
        Armor leatherArmor = rangerFactory.createArmor();
        longbow.displayInfo();
        leatherArmor.displayInfo();
        System.out.println();

        System.out.println("\n═══ PART 3: EQUIPPING CHARACTERS ═══\n");
        
        System.out.println(">>> Equipping " + warrior.getName() + " with Medieval equipment...");
        equipCharacter(warrior, medievalFactory);
        displayCharacterWithEquipment(warrior);
        
        System.out.println(">>> Equipping " + mage.getName() + " with Magic equipment...");
        equipCharacter(mage, magicFactory);
        displayCharacterWithEquipment(mage);
        
        System.out.println(">>> Equipping " + archer.getName() + " with Ranger equipment...");
        equipCharacter(archer, rangerFactory);
        displayCharacterWithEquipment(archer);

        System.out.println("\n═══ EXTENSIBILITY DEMONSTRATION ═══\n");
        System.out.println("✓ How to add a new character class (e.g., Rogue):");
        System.out.println("  1. Create Rogue.java implementing Character interface");
        System.out.println("  2. Create RogueFactory.java extending CharacterFactory");
        System.out.println("  3. No modifications to existing code needed!\n");
        
        System.out.println("✓ How to add a new equipment theme (e.g., Undead):");
        System.out.println("  1. Create UndeadSword.java implementing Weapon");
        System.out.println("  2. Create UndeadArmor.java implementing Armor");
        System.out.println("  3. Create UndeadEquipmentFactory implementing EquipmentFactory");
        System.out.println("  4. No modifications to existing code needed!\n");
        
        System.out.println("This demonstrates the Open/Closed Principle:");
        System.out.println("- OPEN for extension (easy to add new types)");
        System.out.println("- CLOSED for modification (no changes to existing code)\n");

        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║              Demo Complete!                        ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    private static void equipCharacter(Character character, EquipmentFactory factory) {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        character.equipWeapon(weapon);
        character.equipArmor(armor);
    }

    private static void displayCharacterWithEquipment(Character character) {
        System.out.println("\n┌─────────────────────────────────────────┐");
        character.displayStats();
        character.displayEquipment();
        System.out.println("└─────────────────────────────────────────┘\n");
    }
}

