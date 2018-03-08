import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void setUp() throws Exception {
        room = new Room("Treasure Room");

    }

    @Test
    public void hasPlayers() {
        ArrayList<Player> copy = new ArrayList<>();
        Player player1 = new Wizard("Gandalf");
        Player player2 = new Barbarian("Conan");
        room.addPlayer(player1);
        room.addPlayer(player2);
        assertEquals(2, room.countPlayersInRoom());
    }


}
