package decorator.shape;

public class RedColorDecorator extends ShapeDecorator implements Shape {

    public RedColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Adding red color");
    }
}
