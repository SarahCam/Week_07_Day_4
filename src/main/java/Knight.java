import java.util.ArrayList;

public class Knight extends Player implements IArm {

    private ArrayList<Weapon> weapons;

    public Knight(String name) {
        super(name);
        this.weapons = new ArrayList<>();
    }

    @Override
    public ArrayList<Weapon> getWeaponList() {
        return weapons;
    }
}
