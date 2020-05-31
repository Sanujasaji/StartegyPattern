public class ElephantSimulation {
    public static void main(String[] args) {
        Elephant dumbo = new Dumbo();
        dumbo.setFlyBehaviour(new FlyWithEars());
        dumbo.setSoundBehaviour(new talk());
        dumbo.display();
        dumbo.eat();
        dumbo.performSound();
        dumbo.performFly();

        Elephant whiteElephant = new WhiteElephant();
        whiteElephant.setFlyBehaviour(new WontFly());
        whiteElephant.setSoundBehaviour(new trumpet());
        whiteElephant.display();
        whiteElephant.performSound();
        whiteElephant.performFly();
        whiteElephant.sleep();
    }
}
