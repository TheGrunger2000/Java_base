public class Wood extends DoorDecorator {
    private Door door;

    Wood(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Made from Wood";
    }

    @Override
    public double cost() {
        return door.cost() + 20.50;
    }
}
