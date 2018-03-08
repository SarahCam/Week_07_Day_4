import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestKnight {

    Knight knight;

    @Before
    public void setUp() throws Exception {
        knight = new Knight("Lancelot");
    }

    @Test
    public void canGetTreasure() {
        ArrayList<Treasure> copy = new ArrayList<>();
        assertEquals(copy, knight.getTreasureList());
    }

    @Test
    public void canGetWeapons() {
        ArrayList<Weapon> copy = new ArrayList<>();
        assertEquals(copy, knight.getWeaponList());
    }

    @Test
    public void canGetArmours() {
        ArrayList<Armour> copy = new ArrayList<>();
        assertEquals(copy, knight.getArmourList());
    }
}
