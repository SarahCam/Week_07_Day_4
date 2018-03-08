import java.util.ArrayList;



public class Warlock extends Player implements ISpell, ISummon {
    private ArrayList<Spell> spells;
    private ArrayList<Creature> creatures;


    public Warlock(String name) {
        super(name);

        this.spells = new ArrayList<>();
        this.creatures = new ArrayList<>();

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
