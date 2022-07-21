package designbird.v5;

public class LowAltitudeFlyingBehavior implements FlyingBehavior {
    @Override
    public void makeFly() {
        System.out.println("flying low");
    }
}
