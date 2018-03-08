import java.util.ArrayList;

public class Knight extends Player implements IArm, IShield {

    private ArrayList<Weapon> weapons;
    private ArrayList<Armour> armours;

    public Knight(String name) {
        super(name);
        this.weapons = new ArrayList<>();
        this.armours = new ArrayList<>();
    }

    @Override
    public ArrayList<Weapon> getWeaponList() {
        return weapons;
    }


    @Override
    public ArrayList<Armour> getArmourList() {
        return armours;
    }
}
