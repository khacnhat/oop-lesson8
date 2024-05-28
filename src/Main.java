//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        Animal a = new Bird();

        Flyable f = (Flyable)a;
        f.fly();

        //((Flyable)a).fly();

        Swimmable s= (Swimmable) a;
        s.swim();

        //((Swimmable)a).swim();

        Bird b = (Bird) a;
        b.fly();
        b.swim();
        b.eat();
*/
        Bird b = new Bird();
        Fish f = new Fish();

        doSwimming(b);
        doSwimming(f);

    }

    private static void doSwimming(Swimmable swimmable){
        swimmable.swim();
    }
}