public enum TreasureType {
    GOLD(10),
    GEM(5),
    COIN(1);

    private int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
