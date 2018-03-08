public class Creature {
    private CreatureType creature;

    public Creature(CreatureType creature) {
        this.creature = creature;
    }

    public CreatureType getCreatureType() {
        return creature;
    }

    public String getCreatureAction() {
        return creature.getAction();
    }

    public int getCreatureDamage() {
        return creature.getDamage();
    }
}
