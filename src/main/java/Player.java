import java.util.ArrayList;

public abstract class Player {
    
    private String name;
    private int health;
    private ArrayList<Treasure> treasures;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.treasures = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }
}
