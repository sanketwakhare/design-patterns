package shapeprototype;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        System.out.println(circle1.area());
        try {
            Circle clonedCircle = circle1.clone();
            System.out.println(clonedCircle.area());
            System.out.println("old circle: " + circle1);
            System.out.println("cloned circle: " + clonedCircle);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Triangle triangle1 = new Triangle(10, 6);
        System.out.println(triangle1.area());
        try {
            Shape clonedTriangle = triangle1.clone();
            System.out.println(clonedTriangle.area());
            System.out.println("old triangle: " + triangle1);
            System.out.println("cloned triangle: " + clonedTriangle);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
