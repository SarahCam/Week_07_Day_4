import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpell {

    Spell spell;

    @Before
    public void setUp() throws Exception {
        spell = new Spell(SpellType.CAST_ICE);
    }

    @Test
    public void canGetSpellType() {
        assertEquals(SpellType.CAST_ICE, spell.getSpellType());
    }

    @Test
    public void canGetSpellDamage() {
        assertEquals(5, spell.getDamage());
    }
}
