public abstract class Elephant {
    FlyBehaviour flyBehaviour;
    SoundBehaviour soundBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSound() {
        soundBehaviour.makeSound();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void eat() {
        System.out.println("all Elephants eat");
    }

    public void sleep() {
        System.out.println("all Elephants sleep");
    }
}