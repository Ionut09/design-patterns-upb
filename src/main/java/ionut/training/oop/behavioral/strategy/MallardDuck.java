package ionut.training.oop.behavioral.strategy;

import ionut.training.oop.behavioral.strategy.fly.FlyBehaviour;
import ionut.training.oop.behavioral.strategy.quack.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour fly, QuackBehaviour quack) {
        super(fly, quack);
    }

    @Override
    void display() {
        System.out.println("I'm a real mallard duck, quack, quack...");
    }
}
