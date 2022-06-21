package shapeprototype;

public class Triangle extends Shape {

    public Triangle() {
        this.dimentions = new double[2];
    }

    public Triangle(double base, double height) {
        this();
        this.dimentions[0] = base;
        this.dimentions[1] = height;
    }

    @Override
    public double area() {
        return 0.5 * dimentions[0] * dimentions[1];
    }
}
