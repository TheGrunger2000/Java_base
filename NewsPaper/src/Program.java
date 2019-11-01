public class Program {
    public static void main(String[] args) {
        NewsPaper massMedia = new NewsPaper();

        Reader reader = new Reader(massMedia);
        Reader johnCage = new Reader(massMedia);

        massMedia.setNews("Hello, how are you doing? I'm just studying observer pattern...");

        massMedia.unsubscribeSubscriber(reader);

        massMedia.setNews("What's up?");

        massMedia.unsubscribeSubscriber(johnCage);
    }
}
