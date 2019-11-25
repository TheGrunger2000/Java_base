public class Flush extends DoorDecorator {
    private Door door;
    Flush(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Flush Style";
    }

    @Override
    public double cost() {
        return door.cost() + 5;
    }
}
