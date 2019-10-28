public class Program {
    public static void main(String[] args){

        Machine bulldozer = new Bulldozer();

        System.out.println("Bulldozer in Action!");

        bulldozer.performAct();
        bulldozer.performWork();

        bulldozer.setActBehavior(new Drive());
        bulldozer.performAct();

        bulldozer.setWorkBehavior(new Push());
        bulldozer.performWork();

        System.out.println("\n");

        Machine heavyLifter = new Lifter();

        System.out.println("Lifter In Action");

        heavyLifter.performAct();
        heavyLifter.performWork();

        heavyLifter.setActBehavior(new Elevate());
        heavyLifter.performAct();

        heavyLifter.setWorkBehavior(new HelpElevate());
        heavyLifter.performWork();

        System.out.println("\n");

        Machine farmTractor = new Tractor();

        System.out.println("Tractor In Action");

        farmTractor.performAct();
        farmTractor.performWork();

        farmTractor.setActBehavior(new Drive());
        farmTractor.performAct();

        farmTractor.setWorkBehavior(new TransportCargo());
        farmTractor.performWork();

        System.out.println("\n");

        System.out.println("Strategy is great!");
    }
}
