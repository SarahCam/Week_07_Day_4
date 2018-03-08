import java.util.ArrayList;

public class Dwarf extends Player implements IArm{
    private ArrayList<Weapon> weapons;

    public Dwarf(String name) {
        super(name);

        this.weapons = new ArrayList<>();
    }

    public ArrayList<Weapon> getWeaponList() {
        return weapons;
    }

    public int getWeaponCount(){
        return weapons.size();
    }
}
