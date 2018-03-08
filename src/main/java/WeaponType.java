public enum WeaponType {
    SWORD(12),
    AXE(5),
    CROSSBOW(8),
    DAGGER(3);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
