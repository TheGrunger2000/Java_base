public class Engineer extends Person{
    Engineer(){
        actBehavior = new Build();
    }
    @Override
    public void display() {
        actBehavior.act();
    }
}
