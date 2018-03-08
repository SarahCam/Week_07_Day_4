public class Armour {
    private ArmourType armour;

    public Armour(ArmourType armour) {
        this.armour = armour;
    }


    public ArmourType getArmourType() {
        return armour;
    }

    public int getDefenseValue() {
        return armour.getDefenceValue();
    }
}
