public class Dude extends Person{
    Dude(){
        actBehavior = new Chill();
    }
    @Override
    public void display() {
        actBehavior.act();
    }
}
