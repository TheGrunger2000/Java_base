public class Paper extends DoorDecorator {
    private Door door;

    Paper(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Made from Paper";
    }

    @Override
    public double cost() {
        return door.cost() + 5.50;
    }
}
