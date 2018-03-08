import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    private Dwarf dwarf;

    @Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Gimli");
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }
}
