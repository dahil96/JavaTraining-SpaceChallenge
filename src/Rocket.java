import java.util.ArrayList;

public class Rocket implements SpaceShip {

    private int maxLoad;
    private int rocketWeight;
    private int cargoLimit;

    private ArrayList<Item> cargo = new ArrayList<>();

    public Rocket(int maxLoad, int rocketWeight) {
        this.maxLoad = maxLoad;
        this.rocketWeight = rocketWeight;
        this.cargoLimit = this.maxLoad - this.rocketWeight;
    }

    //Returns true for successful launch, false for failed launch
    public boolean launch() {
        return true;
    }

    //Returns true for successful landing, false for failed landing
    public boolean land() {
        return true;
    }

    //Returns true if payload could be excepted, false if load limit would be exceeded
    public boolean canCarry(Item payload) {
        int currentLoad = 0;
        for( Item item : cargo) {
            currentLoad = currentLoad + item.getWeight();
        }

        int testLoad = currentLoad + payload.getWeight();
        return testLoad <= this.maxLoad;
    }

    //Loads given item into the cargo hold
    public void loadPayLoad(Item payload) {
        cargo.add(payload);
    }
}
