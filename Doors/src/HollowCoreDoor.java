public class HollowCoreDoor extends DoorDecorator {
    private Door door;
    HollowCoreDoor(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Hollow Core Inside";
    }

    @Override
    public double cost() {
        return door.cost() + 10.50;
    }
}
