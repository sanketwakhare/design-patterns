package decorator.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedColorDecorator(new Circle());
        Shape multiColorTriangle = new RedColorDecorator(new GreenColorDecorator(new RedColorDecorator(new Triangle())));

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nTriangle with multi color border");
        multiColorTriangle.draw();
    }
}
