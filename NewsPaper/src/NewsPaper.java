import java.util.ArrayList;

public class NewsPaper implements Publisher {
    private ArrayList<Subscriber> readers;
    private String news;

    NewsPaper() {
        readers = new ArrayList<>();
    }

    void setNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    @Override
    public void subscribeSubscriber(Subscriber sb) {
        readers.add(sb);
    }

    public void unsubscribeSubscriber(Subscriber sb) {
        readers.remove(sb);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : readers) {
            subscriber.getNews(news);
        }
    }
}
