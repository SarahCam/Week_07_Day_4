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

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Treasure> getTreasureList() {
        ArrayList<Treasure> copy = new ArrayList<>();
        copy =  treasures;
        return copy;
    }

    public int getTreasureCount() {
        return treasures.size();
    }
}
