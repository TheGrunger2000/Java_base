abstract class Machine {

    private WorkBehavior workBehavior;
    private ActBehavior actBehavior;

    Machine(){
        actBehavior = new DoNothing();
        workBehavior = new Rest();
    }

    void display(){
        actBehavior.act();
        workBehavior.work();
    }

    void performAct(){
        actBehavior.act();
    }

    void performWork(){
        workBehavior.work();
    }

    void setWorkBehavior(WorkBehavior wb){
        workBehavior = wb;
    }

    void setActBehavior(ActBehavior ab){
        actBehavior = ab;
    }
}
