public class HeavyDoor extends Door {
    HeavyDoor() {
        description = "This is a Heavy Door";
    }

    @Override
    public double cost() {
        return 150.50;
    }
}
