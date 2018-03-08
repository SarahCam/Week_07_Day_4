import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeapon {
    Weapon weapon;

    @Before
    public void setUp() throws Exception {
        weapon = new Weapon(WeaponType.SWORD);
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }

    @Test
    public void canGetWeaponTypeDamageValue() {
        assertEquals(12, weapon.getDamage());
    }
}
