package shapeprototype;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        System.out.println(circle1.area());

        Triangle triangle1 = new Triangle(10,6);
        System.out.println(triangle1.area());
    }
}
