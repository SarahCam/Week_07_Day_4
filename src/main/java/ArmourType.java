public enum ArmourType {
    HELMET(2),
    SHIELD(3),
    GAUNTLETS(1),
    CHESTPLATE(2);

    private final int defenceValue;

    ArmourType(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getDefenceValue(){
        return this.defenceValue;
    }
}
