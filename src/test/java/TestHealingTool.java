import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealingTool {

    HealingTool healingTool;

    @Before
    public void setUp() throws Exception {
        healingTool = new HealingTool(HealingToolType.GREEN_POTION);
    }

    @Test
    public void canGetHealingToolType() {
        assertEquals(HealingToolType.GREEN_POTION, healingTool.getHealingToolType());
    }

    @Test
    public void canGetHealingToolHealthValue() {
        assertEquals(20, healingTool.getHealthValue());
    }
}
