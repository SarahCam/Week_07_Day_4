import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestWarlock {
    Warlock warlock;

    @Before
    public void setUp() throws Exception {
        warlock = new Warlock("Ming the Merciless");
    }

    @Test
    public void hasTreasureList() {
        ArrayList<Treasure> copy = new ArrayList<>();
        assertEquals(copy, warlock.getTreasureList());
    }

    @Test
    public void hasSpellList() {
        ArrayList<Spell> copy = new ArrayList<>();
        assertEquals(copy, warlock.getSpellList());
    }

    @Test
    public void hasCreatureList() {
        ArrayList<Creature> copy = new ArrayList<>();
        assertEquals(copy, warlock.getCreatureList());
    }
}
