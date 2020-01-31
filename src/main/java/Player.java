

public class Player {
    private String charName;
    private int xp;
    private Background background;
    private Race race;
    private pAlignment alignment;
    private String playerName;
    private pClass pClass;


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public pAlignment getAlignment() {
        return alignment;
    }

    public void setAlignment(pAlignment alignment) {
        this.alignment = alignment;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player.pClass getpClass() {
        return pClass;
    }

    public void setpClass(Player.pClass pClass) {
        this.pClass = pClass;
    }

    enum pClass{
        BARBARIAN,
        BARD,
        CLERIC,
        DRUID,
        FIGHTER,
        MONK,
        PALADIN,
        RANGER,
        ROGUE,
        SORCERER,
        WARLOCK,
        WIZARD
    }

    enum Background {
        ACOLYTE,
        CHARLATAN,
        CRIMINAL,
        ENTERTAINER,
        FOLKHERO,
        GUILDARTISAN,
        HERMIT,
        NOBLE,
        OUTLANDER,
        SAGE,
        SAILOR,
        SOLDIER,
        URCHIN
    }

    enum Race {
        DWARF,
        ELF,
        HALFLING,
        HUMAN,
        DRAGONBORN,
        GNOME,
        HALFELF,
        HALFORC,
        TIEFLING
    }

    enum pAlignment {
        LAWFULGOOD,
        NEUTRALGOOD,
        CHAOTICGOOD,
        LAWFULNEUTRAL,
        TRUENEUTRAL,
        CHAOTICNEUTRAL,
        LAWFULEVIL,
        NEUTRALEVIL,
        CHAOTICEVIL
    }
}
