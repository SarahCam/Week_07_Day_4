import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    private ArrayList<HealingTool> healingTools;

    public Cleric(String name) {
        super(name);
        this.healingTools = new ArrayList<>();
    }

    @Override
    public ArrayList<HealingTool> getHealingToolList() {
        return healingTools;
    }
}
