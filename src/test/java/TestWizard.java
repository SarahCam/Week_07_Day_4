import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestWizard {
    Wizard wizard;

    @Before
    public void setUp() throws Exception {
        wizard = new Wizard("Gandalf");
    }

    @Test
    public void canGetSpellList() {
        ArrayList<Spell> copy = new ArrayList<>();
        assertEquals(copy, wizard.getSpellList());
    }

    @Test
    public void hasCreatureList() {
        ArrayList<Creature> copy = new ArrayList<>();
        assertEquals(copy, wizard.getCreatureList());
    }
}
