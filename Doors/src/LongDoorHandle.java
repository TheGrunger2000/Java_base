public class LongDoorHandle extends DoorDecorator{
    private Door door;

    LongDoorHandle(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", With Long Door Handle";
    }

    @Override
    public double cost() {
        return door.cost() + 30.50;
    }
}
