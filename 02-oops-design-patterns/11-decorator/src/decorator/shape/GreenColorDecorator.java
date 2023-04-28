package decorator.shape;

public class GreenColorDecorator extends ShapeDecorator implements Shape {

    public GreenColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Adding green color");
    }
}
