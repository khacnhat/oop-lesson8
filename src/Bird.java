public class Bird extends Animal implements Swimmable, Flyable{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming on the surface...");
    }
}
