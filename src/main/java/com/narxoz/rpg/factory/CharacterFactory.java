package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
    
    public Character createAndDisplay(String name) {
        Character character = createCharacter(name);
        character.displayStats();
        return character;
    }
}
