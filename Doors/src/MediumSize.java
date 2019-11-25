public class MediumSize extends DoorDecorator{
    private Door door;

    MediumSize(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", 24\" door size";
    }

    @Override
    public double cost() {
        return door.cost() + 10.50;
    }
}
