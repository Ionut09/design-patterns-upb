package ionut.training.oop.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

import ionut.training.oop.behavioral.visitor.model.Circle;
import ionut.training.oop.behavioral.visitor.model.Shape;
import ionut.training.oop.behavioral.visitor.model.Square;

public class VisitorHapiness {

    public static void main(String... args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(8),
                new Circle(5),
                new Square(4),
                new Square(5)
        );

        //homework, faceti voi un perimeterCalculatorVisitor
        AreaCalculatorVisitor areaCalculatorVisitor = new AreaCalculatorVisitor();

        for (Shape shape : shapes) {
            shape.accept(areaCalculatorVisitor);
        }

        System.out.println("Area for all figures is: " + areaCalculatorVisitor.getTotal());
    }
}
