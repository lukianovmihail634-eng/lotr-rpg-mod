# LotR RPG Mod for Minecraft 1.20.1 Forge

🧙‍♂️ A comprehensive RPG mod inspired by **Lord of the Rings** with unique character classes, skills, and progression systems.

## 🎮 Features

### 📚 6 Unique Classes

1. **⚔️ Warrior (Воин)**
   - High HP and Strength
   - Tank playstyle with armor skills
   - Skills: Power Slash, Shield Bash, Last Stand

2. **🧙 Wizard (Волшебник)**
   - Intelligence and Wisdom based
   - Powerful magic abilities
   - Skills: Fireball, Ice Storm, Mana Shield

3. **🏹 Ranger (Рейнджер)**
   - High Dexterity and Speed
   - Precision damage dealer
   - Skills: Multi Shot, Aimed Shot, Evasion

4. **✨ Elf (Эльф)**
   - Balanced Magic and Agility
   - Grace and nature magic
   - Skills: Arcane Bolt, Nature Blessing, Elven Grace

5. **🛡️ Dwarf (Гном)**
   - Maximum HP and Armor
   - Mining and crafting bonuses
   - Skills: Iron Skin, Mining Boost, Stone Form

6. **🌙 Hobbit (Хоббит)**
   - Luck and Stealth
   - Small but mighty
   - Skills: Lucky Strike, Invisibility, Fortitude

### ⚡ Skill System

- **18 Total Skills** (3 per class)
- **Mana-based casting**
- **Cooldown system**
- **Progressive learning**
- **Unique class abilities**

### 📈 Character Progression

- **Experience points** system
- **Level up mechanics**
- **Skill learning**
- **Stat growth**
- **Persistent character data**

### 📊 Character Stats

Each class has unique base stats:
- **Health** (Здоровье)
- **Strength** (Сила)
- **Intelligence** (��нтеллект)
- **Wisdom** (Мудрость)
- **Dexterity** (Ловкость)
- **Luck** (Удача)

## 📋 Project Structure

```
lotr-rpg-mod/
├── src/main/
│   ├── java/com/lotrpg/
│   │   ├── LotRRpgMod.java
│   │   ├── character/
│   │   │   ├── classes/
│   │   │   │   ├── CharacterClass.java
│   │   │   │   └── ClassStats.java
│   │   │   ├── skills/
│   │   │   │   ├── Skill.java
│   │   │   │   └── SkillRegistry.java
│   │   │   └── data/
│   │   │       └── PlayerCharacterData.java
│   │   └── ...
│   └── resources/
│       └── META-INF/
│           └── mods.toml
├── build.gradle
├── .gitignore
└── README.md
```

## 🛠️ Setup & Installation

### Prerequisites
- Java 17+
- Gradle 7.6+
- Minecraft Forge 1.20.1

### Build Instructions

1. Clone the repository:
```bash
git clone https://github.com/lukianovmihail634-eng/lotr-rpg-mod.git
cd lotr-rpg-mod
```

2. Setup Forge development environment:
```bash
./gradlew genEclipseRuns
# or
./gradlew genIntellijRuns
```

3. Build the mod:
```bash
./gradlew build
```

4. The compiled mod will be in `build/libs/`

## 📦 Installation in Minecraft

1. Download the mod JAR from releases
2. Place it in your `mods` folder
3. Launch Minecraft with Forge
4. The mod is ready to use!

## 🎯 In-Game Usage

### Selecting a Class
```
/class select <classname>
```
Example: `/class select warrior`

### Checking Class Info
```
/class info
```

### Learning Skills
```
/skill learn <skillname>
```
Example: `/skill learn slash`

### Using Skills
Right-click with your character to use active skills.

## 🔮 Planned Features

- [ ] Custom items and armor for each class
- [ ] Mob enemies with class-based AI
- [ ] Dungeons and bosses
- [ ] PvP class balancing
- [ ] Quest system
- [ ] Custom talents tree
- [ ] Enchantments system
- [ ] Config file support

## 📝 Configuration

Edit `mods.toml` to customize:
- Mod version
- Display name
- Description
- Authors

## 🐛 Bug Reports

If you find bugs, please open an issue on GitHub!

## 📄 License

MIT License - Feel free to use and modify!

## 👥 Contributors

- LotR RPG Team

## 🔗 Links

- [Minecraft Forge](https://minecraftforge.net/)
- [Gradle](https://gradle.org/)
- [GitHub Repository](https://github.com/lukianovmihail634-eng/lotr-rpg-mod)

---

**Made with ❤️ for Minecraft and Lord of the Rings fans**
