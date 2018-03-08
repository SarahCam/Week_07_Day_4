import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }


    public void addPlayer(Player player) {
        players.add(player);
    }

    public int countPlayersInRoom() {
     return  players.size();
    }
}
