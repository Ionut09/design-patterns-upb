package ionut.training.oop.behavioral.strategy;

public class DuckHunt {

    public static void main(String... args) {

        Duck duck = new MallardDuck(
                () -> System.out.println("Look me how I'm flying"),
                () -> System.out.println("quack quack")
        );

    }
}
