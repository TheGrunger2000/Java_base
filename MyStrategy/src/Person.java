abstract class Person {

    ActBehavior actBehavior;

    Person(){
    }

    public abstract void display();

    void performAct(){
        actBehavior.act();
    }

    public void walk(){
        System.out.println("I go");
    }

    public void jump(){
        System.out.println("I jump");
    }
}
