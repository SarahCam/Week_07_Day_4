public enum CreatureType {
    BALROG("Fire Whip", 45),
    DRAGON("Breathe Fire", 45),
    ENT("Trample", 50);

    private final String action;

    private final int damage;

    CreatureType(String action, int damage) {
        this.action = action;
        this.damage = damage;
    }

    public String getAction() {
        return action;
    }

    public int getDamage() {
        return damage;
    }
}
