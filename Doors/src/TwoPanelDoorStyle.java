public class TwoPanelDoorStyle extends DoorDecorator {
    private Door door;
    TwoPanelDoorStyle(Door door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription() + ", Two Panel Style Outside";
    }

    @Override
    public double cost() {
        return door.cost() + 20.50;
    }
}
