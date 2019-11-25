public class SmallSize extends DoorDecorator {
    private Door door;

    SmallSize(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", 18\" door size";
    }

    @Override
    public double cost() {
        return door.cost() + 5.50;
    }
}
