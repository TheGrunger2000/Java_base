public class SimpleObserver implements Observer {
    private int value;

    SimpleObserver(Subject simpleSubject) {
        simpleSubject.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }

    private void display() {
        System.out.println("Value: " + value);
    }
}
