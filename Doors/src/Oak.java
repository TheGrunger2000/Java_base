public class Oak extends DoorDecorator {
    private Door door;
    Oak(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Oak Material";
    }

    @Override
    public double cost() {
        return door.cost() + 5;
    }
}
