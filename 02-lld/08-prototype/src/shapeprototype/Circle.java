package shapeprototype;

public class Circle extends Shape {

    Circle() {
        this.dimentions = new double[1];
    }

    Circle(double radius) {
        this();
        this.dimentions[0] = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.dimentions[0] * this.dimentions[0];
    }
}
