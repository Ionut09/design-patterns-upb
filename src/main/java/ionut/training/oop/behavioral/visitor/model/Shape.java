package ionut.training.oop.behavioral.visitor.model;

import ionut.training.oop.behavioral.visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
