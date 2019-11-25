public class MediumDoor extends Door {
    MediumDoor() {
        description = "This is a Medium Door";
    }

    @Override
    public double cost() {
        return 100.50;
    }
}
