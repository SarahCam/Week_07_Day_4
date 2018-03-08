import java.util.ArrayList;

public class Barbarian extends Player implements IArm {

    private ArrayList<Weapon> weapons;

    public Barbarian(String name) {
        super(name);
        this.weapons = new ArrayList<>();
    }

    public ArrayList<Weapon> getWeaponList() {
        return weapons;
    }
}
