public interface Publisher {
    void subscribeSubscriber(Subscriber sb);
    void unsubscribeSubscriber(Subscriber sb);
    void notifySubscribers();
}
