package com.lotrpg.character.skills;

import net.minecraft.world.entity.player.Player;

public abstract class Skill {
    protected final String skillId;
    protected final String displayName;
    protected final String description;
    protected final int manaCost;
    protected final int cooldown;
    protected int currentCooldown = 0;

    public Skill(String skillId, String displayName, String description, int manaCost, int cooldown) {
        this.skillId = skillId;
        this.displayName = displayName;
        this.description = description;
        this.manaCost = manaCost;
        this.cooldown = cooldown;
    }

    public abstract void execute(Player player);

    public boolean canUse(Player player) {
        return currentCooldown == 0;
    }

    public void resetCooldown() {
        currentCooldown = cooldown;
    }

    public void updateCooldown() {
        if (currentCooldown > 0) {
            currentCooldown--;
        }
    }

    public String getSkillId() { return skillId; }
    public String getDisplayName() { return displayName; }
    public String getDescription() { return description; }
    public int getManaCost() { return manaCost; }
    public int getCooldown() { return cooldown; }
    public int getCurrentCooldown() { return currentCooldown; }
}
