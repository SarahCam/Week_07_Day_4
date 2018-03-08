import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCleric {

    Cleric cleric;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric("Morpheus");
    }

    @Test
    public void canGetName() {
        assertEquals("Morpheus", cleric.getName());
    }

    @Test
    public void canGetHealingTools() {
        ArrayList<HealingTool> copy = new ArrayList<>();
        assertEquals(copy, cleric.getHealingToolList());
    }

}
