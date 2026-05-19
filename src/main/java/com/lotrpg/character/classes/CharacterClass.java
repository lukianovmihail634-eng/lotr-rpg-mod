package com.lotrpg.character.classes;

public enum CharacterClass {
    WARRIOR("Воин", 20, 18, 10, 12, 10, 8),
    WIZARD("Волшебник", 12, 10, 20, 16, 14, 12),
    RANGER("Рейнджер", 15, 14, 12, 14, 18, 10),
    ELF("Эльф", 14, 12, 16, 15, 16, 14),
    DWARF("Гном", 22, 16, 10, 12, 10, 12),
    HOBBIT("Хоббит", 16, 10, 12, 14, 20, 16);

    private final String displayName;
    private final int health;
    private final int strength;
    private final int intelligence;
    private final int wisdom;
    private final int dexterity;
    private final int luck;

    CharacterClass(String displayName, int health, int strength, int intelligence, int wisdom, int dexterity, int luck) {
        this.displayName = displayName;
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.dexterity = dexterity;
        this.luck = luck;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }
    public int getWisdom() { return wisdom; }
    public int getDexterity() { return dexterity; }
    public int getLuck() { return luck; }

    public String getDescription() {
        return switch(this) {
            case WARRIOR -> "Мощный воин с высокой защитой и здоровьем";
            case WIZARD -> "Великий волшебник, владеющий магией";
            case RANGER -> "Ловкий рейнджер со скоростью и точностью";
            case ELF -> "Грациозный эльф с балансом магии и ловкости";
            case DWARF -> "Крепкий гном с толстой броней";
            case HOBBIT -> "Маленький хоббит со скрытностью и удачей";
        };
    }
}
