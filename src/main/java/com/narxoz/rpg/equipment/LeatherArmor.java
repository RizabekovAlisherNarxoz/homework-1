package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private int defense;
    private String armorType;
    private int agilityBonus;

    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Medium Armor";
        this.agilityBonus = 15;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Flexible armor allowing swift movement";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Agility Bonus: +" + agilityBonus);
    }
}
