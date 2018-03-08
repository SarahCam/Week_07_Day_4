import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    private Dwarf dwarf;

    @Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Gimli");
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetTreasureList__NoTreasure() {
        ArrayList<Treasure> treasures = new ArrayList<>();
        assertEquals(treasures, dwarf.getTreasureList());
        assertEquals(0, dwarf.getTreasureCount());

    }

    @Test
    public void canGetWeaponList() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        assertEquals(weapons, dwarf.getWeaponList());
        assertEquals(0, dwarf.getWeaponCount());

    }
}
