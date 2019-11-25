public class RoundDoorHandle extends DoorDecorator {
    private Door door;

    RoundDoorHandle(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", With Round Door Handle";
    }

    @Override
    public double cost() {
        return door.cost() + 10.10;
    }
}
