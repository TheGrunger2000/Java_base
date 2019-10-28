abstract class Person {

    ActBehavior actBehavior;

    Person(){
    }

    public abstract void display();

    void performAct(){
        actBehavior.act();
    }

    void setActBehavior(ActBehavior ab){
        actBehavior = ab;
    }

    public void walk(){
        System.out.println("I go");
    }

    public void jump(){
        System.out.println("I jump");
    }
}
