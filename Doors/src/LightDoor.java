public class LightDoor extends Door {
    LightDoor() {
        description = "This is a Light Door";
    }

    @Override
    public double cost() {
        return 50.50;
    }
}
