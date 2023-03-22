package homework_3.Objects;

import homework_3.Figure;

public class Circle extends Figure {
    private Double diameter;

    public Circle(Double diameter) {
        this.diameter = diameter;
    }

    public Circle() {
        this.diameter = 2.0;
    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

}
