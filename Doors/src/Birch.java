public class Birch extends DoorDecorator {
    private Door door;
    Birch(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Birch Material";
    }

    @Override
    public double cost() {
        return door.cost() + 5.50;
    }
}
