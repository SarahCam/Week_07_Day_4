public enum HealingToolType {
    GREEN_POTION(20),
    RED_POTION(10),
    BLUE_POTION(5);

    private final int healthValue;

    HealingToolType(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }
}
