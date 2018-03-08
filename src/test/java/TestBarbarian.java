import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBarbarian {

    Barbarian barbarian;

    @Before
    public void setUp() throws Exception {
        barbarian = new Barbarian("Conan");
    }

    @Test
    public void getName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void getWeaponList() {
        ArrayList<Weapon> copy = new ArrayList<>();
        assertEquals(copy, barbarian.getWeaponList());
    }
}
