public class Program {
    public static void main(String[] args) {
        Programmer somebody;

        somebody = new GabeNewel();
        somebody.say();
        // somebody.mysteryThoughts();

        somebody = new ToddHoward();
        somebody.say();

        somebody = new Kojima();
        somebody.say();
    }
}
