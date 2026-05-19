package com.lotrpg.character.skills;

import net.minecraft.world.entity.player.Player;
import java.util.HashMap;
import java.util.Map;

public class SkillRegistry {
    private static final Map<String, Skill> SKILLS = new HashMap<>();

    public static void register() {
        // Warrior Skills
        registerSkill(new Skill("slash", "Мощный удар", "Нанести большой урон", 10, 20) {
            @Override
            public void execute(Player player) {
                player.setHealth(Math.min(player.getHealth() + 5, player.getMaxHealth()));
            }
        });
        registerSkill(new Skill("shield_bash", "Удар щитом", "Оглушить врага", 15, 30) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE, 100, 1));
            }
        });
        registerSkill(new Skill("last_stand", "Последняя стойка", "Временно увеличить защиту", 20, 60) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE, 200, 2));
            }
        });

        // Wizard Skills
        registerSkill(new Skill("fireball", "Огненный шар", "Запустить огненный шар", 30, 25) {
            @Override
            public void execute(Player player) {
                player.level().explode(null, player.getX(), player.getY(), player.getZ(), 3, net.minecraft.world.level.Explosion.BlockInteraction.NONE);
            }
        });
        registerSkill(new Skill("ice_storm", "Ледяная буря", "Создать ледяную бурю", 40, 40) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.SLOWNESS, 150, 2));
            }
        });
        registerSkill(new Skill("mana_shield", "Магический щит", "Щит из маны", 50, 50) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE, 150, 1));
            }
        });

        // Ranger Skills
        registerSkill(new Skill("multi_shot", "Множественный выстрел", "Выстрелить несколько стрел", 20, 15) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.MOVEMENT_SPEED, 100, 1));
            }
        });
        registerSkill(new Skill("aimed_shot", "Точный выстрел", "Точный выстрел с критическим уроном", 15, 10) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.MOVEMENT_SPEED, 50, 2));
            }
        });
        registerSkill(new Skill("evasion", "Уклонение", "Повысить ловкость и скорость", 10, 20) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.MOVEMENT_SPEED, 200, 2));
            }
        });

        // Elf Skills
        registerSkill(new Skill("arcane_bolt", "Магический bolt", "Выпустить магический projectile", 25, 12) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.GLOWING, 50, 0));
            }
        });
        registerSkill(new Skill("nature_blessing", "Благословение природы", "Восстановить здоровье", 30, 30) {
            @Override
            public void execute(Player player) {
                player.heal(5);
            }
        });
        registerSkill(new Skill("elven_grace", "Грация эльфа", "Временно улучшить все характеристики", 35, 45) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.MOVEMENT_SPEED, 150, 1));
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.JUMP, 150, 1));
            }
        });

        // Dwarf Skills
        registerSkill(new Skill("iron_skin", "Железная кожа", "Увеличить броню", 20, 30) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE, 200, 2));
            }
        });
        registerSkill(new Skill("mining_boost", "Ускорение добычи", "Быстрее копать блоки", 15, 15) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DIG_SPEED, 200, 2));
            }
        });
        registerSkill(new Skill("stone_form", "Каменная форма", "Превратиться в камень для защиты", 40, 60) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE, 300, 3));
            }
        });

        // Hobbit Skills
        registerSkill(new Skill("lucky_strike", "Удачный удар", "Критический удар с шансом", 10, 12) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.LUCK, 100, 2));
            }
        });
        registerSkill(new Skill("invisibility", "Невидимость", "Стать невидимым", 25, 40) {
            @Override
            public void execute(Player player) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.INVISIBILITY, 150, 0));
            }
        });
        registerSkill(new Skill("fortitude", "Стойкость", "Увеличить максимальное здоровье", 30, 50) {
            @Override
            public void execute(Player player) {
                player.heal(10);
            }
        });
    }

    public static void registerSkill(Skill skill) {
        SKILLS.put(skill.getSkillId(), skill);
    }

    public static Skill getSkill(String skillId) {
        return SKILLS.get(skillId);
    }

    public static Map<String, Skill> getAllSkills() {
        return SKILLS;
    }
}
