package ionut.training.oop.behavioral.visitor;

import ionut.training.oop.behavioral.visitor.model.Circle;
import ionut.training.oop.behavioral.visitor.model.Square;

public interface Visitor {
    void visit(Square square);
    void visit(Circle circle);
}
