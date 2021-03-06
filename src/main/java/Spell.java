public class Spell {

    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public int getDamage() {
        return spellType.getDamage();
    }
}
