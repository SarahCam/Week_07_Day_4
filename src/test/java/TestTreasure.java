import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTreasure {
    Treasure treasure;

    @Before
    public void setUp() throws Exception {
        treasure = new Treasure(TreasureType.GOLD);
    }

    @Test
    public void canGetTreasure() {
        assertEquals(TreasureType.GOLD, treasure.getTreasure());
    }
}
