package ionut.training.oop.behavioral.visitor;

import ionut.training.oop.behavioral.visitor.model.Circle;
import ionut.training.oop.behavioral.visitor.model.Square;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaCalculatorVisitor implements Visitor {
    private double total;

    @Override
    public void visit(Square square) {
        total += pow(square.getEdge(), 2);
    }

    @Override
    public void visit(Circle circle) {
        total += pow(circle.getRadius(), 2) * PI;
    }

    public double getTotal() {
        return total;
    }
}
