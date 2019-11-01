public class Reader implements Subscriber {
    private String news;

    Reader(Publisher newsPaper) {
        newsPaper.subscribeSubscriber(this);
    }

    @Override
    public void getNews(String news) {
        this.news = news;
        displayNews();
    }

    private void displayNews() {
        System.out.println(news);
    }
}
