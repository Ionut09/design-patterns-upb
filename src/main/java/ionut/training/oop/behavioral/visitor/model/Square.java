package ionut.training.oop.behavioral.visitor.model;

import ionut.training.oop.behavioral.visitor.Visitor;

public class Square implements Shape {

    private final int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getEdge() {
        return edge;
    }
}
