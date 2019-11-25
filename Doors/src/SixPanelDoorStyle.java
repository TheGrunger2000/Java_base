public class SixPanelDoorStyle extends DoorDecorator {
    private Door door;
    SixPanelDoorStyle(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Six Panel Door Style";
    }

    @Override
    public double cost() {
        return door.cost() + 25;
    }
}
