package designbird.v2;

public abstract class FlyableBird extends  Bird{

    public FlyableBird(String type) {
        super(type);
    }

    public abstract void fly();
}
