package shapeprototype;

public class Circle extends Shape implements Cloneable {

    Circle() {
        this.dimentions = new double[1];
    }

    Circle(int radius) {
        this();
        this.dimentions[0] = radius;
    }

    Circle(Circle old) {
        this();
        this.dimentions[0] = old.dimentions[0];
    }

    @Override
    public double area() {
        return Math.PI * this.dimentions[0] * this.dimentions[0];
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return new Circle(this);
    }
}
