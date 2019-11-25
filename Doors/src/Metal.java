public class Metal extends DoorDecorator {
    private Door door;

    Metal(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Made from Metal";
    }

    @Override
    public double cost() {
        return door.cost() + 60.50;
    }
}
