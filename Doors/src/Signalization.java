public class Signalization extends DoorDecorator {
    private Door door;

    Signalization(Door door) {
        this.door = door;
    }
    @Override
    public String getDescription() {
        return door.getDescription() + ", With Signalization";
    }

    @Override
    public double cost() {
        return door.cost() + 100.50;
    }
}
