import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreature {
    Creature creature;

    @Before
    public void setUp() throws Exception {
        creature = new Creature(CreatureType.BALROG);
    }

    @Test
    public void canGetCreatureType() {
        assertEquals(CreatureType.BALROG, creature.getCreatureType());
    }

    @Test
    public void canGetCreatureAction() {
        assertEquals("Fire Whip", creature.getCreatureAction());
    }

    @Test
    public void canGetCreatureDamage() {
       assertEquals(45, creature.getCreatureDamage());
    }
}
