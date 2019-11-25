public class BigSize extends DoorDecorator {
    private Door door;

    BigSize(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", 36\" door size";
    }

    @Override
    public double cost() {
        return door.cost() + 20.50;
    }
}
