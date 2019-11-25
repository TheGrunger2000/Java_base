public class Program {
    public static void main(String[] args) {
        Door door = new LightDoor();
        System.out.println(door.getDescription());

        door = new Metal(door);
        System.out.println(door.getDescription());

        door = new LongDoorHandle(door);
        System.out.println(door.getDescription());

        door = new Signalization(door);
        System.out.println(door.getDescription());

        System.out.println("\nFinal Cost: " + door.cost());
    }
}
