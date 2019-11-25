public class Program {
    public static void main(String[] args) {
        // Door Type:
        Door door = new MediumDoor();
        // Door Size:
        door = new BigSize(door);
        // Material:
        door = new Birch(door);
        // Core
        door = new HollowCoreDoor(door);
        // Style
        door = new Flush(door);

        System.out.println(door.getDescription());
        System.out.println("Final Price: " + door.cost() + "$");
    }
}
