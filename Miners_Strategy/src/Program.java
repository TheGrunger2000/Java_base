public class Program {
    public static void main(String[] args){

        Machine bulldozer = new Bulldozer();

        bulldozer.performAct();
        bulldozer.performWork();

        bulldozer.setActBehavior(new Drive());
        bulldozer.performAct();

        bulldozer.setWorkBehavior(new Push());
        bulldozer.performWork();


        Machine heavyLifter = new Lifter();
        heavyLifter.performAct();
        heavyLifter.performWork();

        heavyLifter.setActBehavior(new Elevate());
        heavyLifter.performAct();

        heavyLifter.setWorkBehavior(new HelpElevate());
        heavyLifter.performWork();


        Machine farmTractor = new Tractor();

        farmTractor.performAct();
        farmTractor.performWork();

        farmTractor.setActBehavior(new Drive());
        farmTractor.performAct();

        farmTractor.setWorkBehavior(new TransportCargo());
        farmTractor.performWork();

        System.out.println("Strategy is great!");
    }
}
