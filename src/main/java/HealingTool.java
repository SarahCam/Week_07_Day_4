public class HealingTool {

    private HealingToolType healingTool;

    public HealingTool(HealingToolType healingTool) {
        this.healingTool = healingTool;
    }


    public HealingToolType getHealingToolType() {
        return healingTool;
    }

    public int getHealthValue() {
        return healingTool.getHealthValue();
    }
}
