import java.util.ArrayList;

public class Wizard extends Player implements ISpell, ISummon {

    private ArrayList<Spell> spells;
    private ArrayList<Creature> creatures;

    public Wizard(String name) {
        super(name);

        this.creatures = new ArrayList<>();
        this.spells = new ArrayList<>();
    }

    @Override
    public ArrayList<Spell> getSpellList() {
        return spells;
    }

    @Override
    public ArrayList<Creature> getCreatureList() {
        return creatures;
    }
}
