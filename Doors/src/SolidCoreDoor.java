public class SolidCoreDoor extends DoorDecorator {
    private Door door;
    SolidCoreDoor(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Solid Core Inside";
    }

    @Override
    public double cost() {
        return door.cost() + 15.50;
    }
}
