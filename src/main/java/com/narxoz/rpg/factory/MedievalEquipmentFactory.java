package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.IronSword;
import com.narxoz.rpg.equipment.PlateArmor;

public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }
    
    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
