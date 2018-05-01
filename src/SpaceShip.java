public interface SpaceShip {
    //Returns true for successful launch, false for failed launch
    boolean launch();

    //Returns true for successful landing, false for failed landing
    boolean land();

    //Returns true if payload could be excepted, false if load limit would be exceeded
    boolean canCarry(Item payload);

    //Loads given item into the cargo hold
    void loadPayLoad(Item payload);
}
