public class Warrior extends Person{
    Warrior(){
        actBehavior = new Attack();
    }
    @Override
    public void display() {
        actBehavior.act();
    }
}
