import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArmour {
    Armour armour;

    @Before
    public void setUp() throws Exception {
        armour = new Armour(ArmourType.HELMET);
    }

    @Test
    public void canGetArmourType() {
        assertEquals(ArmourType.HELMET, armour.getArmourType());
    }

    @Test
    public void canGetDefenseValue() {
        assertEquals(2, armour.getDefenseValue());
    }
}
