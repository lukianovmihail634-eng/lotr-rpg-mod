package com.lotrpg.character.data;

import com.lotrpg.character.classes.CharacterClass;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.player.Player;

import java.util.HashSet;
import java.util.Set;

public class PlayerCharacterData {
    private CharacterClass characterClass;
    private int level = 1;
    private int experience = 0;
    private Set<String> learnedSkills = new HashSet<>();
    private int mana = 100;
    private int maxMana = 100;

    public PlayerCharacterData() {
        this.characterClass = CharacterClass.WARRIOR;
    }

    public void setCharacterClass(CharacterClass clazz) {
        this.characterClass = clazz;
        this.mana = 100;
        this.maxMana = 100;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void addExperience(int exp) {
        this.experience += exp;
        if (this.experience >= level * 100) {
            levelUp();
        }
    }

    public void levelUp() {
        this.level++;
        this.experience = 0;
        this.maxMana += 20;
        this.mana = maxMana;
    }

    public void learnSkill(String skillId) {
        learnedSkills.add(skillId);
    }

    public boolean hasSkill(String skillId) {
        return learnedSkills.contains(skillId);
    }

    public void consumeMana(int amount) {
        this.mana = Math.max(0, mana - amount);
    }

    public void regenerateMana(int amount) {
        this.mana = Math.min(maxMana, mana + amount);
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void saveData(CompoundTag tag) {
        tag.putString("Class", characterClass.name());
        tag.putInt("Level", level);
        tag.putInt("Experience", experience);
        tag.putInt("Mana", mana);
        tag.putInt("MaxMana", maxMana);

        ListTag skillsList = new ListTag();
        for (String skill : learnedSkills) {
            CompoundTag skillTag = new CompoundTag();
            skillTag.putString("Skill", skill);
            skillsList.add(skillTag);
        }
        tag.put("Skills", skillsList);
    }

    public void loadData(CompoundTag tag) {
        if (tag.contains("Class")) {
            characterClass = CharacterClass.valueOf(tag.getString("Class"));
        }
        level = tag.getInt("Level");
        experience = tag.getInt("Experience");
        mana = tag.getInt("Mana");
        maxMana = tag.getInt("MaxMana");

        if (tag.contains("Skills")) {
            ListTag skillsList = tag.getList("Skills", Tag.TAG_COMPOUND);
            learnedSkills.clear();
            for (int i = 0; i < skillsList.size(); i++) {
                CompoundTag skillTag = skillsList.getCompound(i);
                learnedSkills.add(skillTag.getString("Skill"));
            }
        }
    }
}
