package ionut.training.oop.behavioral.visitor.model;

import ionut.training.oop.behavioral.visitor.Visitor;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
