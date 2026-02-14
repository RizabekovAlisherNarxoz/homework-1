package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    void displayStats();
    void useSpecialAbility();
    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void displayEquipment();
}
