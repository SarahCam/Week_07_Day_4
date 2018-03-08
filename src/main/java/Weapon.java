public class Weapon {
    private WeaponType type;

    public Weapon(WeaponType type) {
        this.type = type;

    }

    public WeaponType getWeaponType() {
        return type;
    }


    public int getDamage() {
        return type.getDamage();
    }
}
