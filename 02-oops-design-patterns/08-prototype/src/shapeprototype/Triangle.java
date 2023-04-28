package shapeprototype;

public class Triangle extends Shape implements Cloneable {

    public Triangle() {
        this.dimentions = new double[2];
    }

    public Triangle(double base, double height) {
        this();
        this.dimentions[0] = base;
        this.dimentions[1] = height;
    }

    public Triangle(Triangle old) {
        this(old.dimentions[0], old.dimentions[1]);
    }

    @Override
    public double area() {
        return 0.5 * dimentions[0] * dimentions[1];
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException {
        return new Triangle(this);
    }
}
