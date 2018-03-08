public enum SpellType {
    CAST_ICE(5),
    CAST_FIRE(10),
    CAST_WIND(20);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
