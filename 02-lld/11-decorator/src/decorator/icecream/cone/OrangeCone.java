package decorator.icecream.cone;

import decorator.icecream.ICone;

public class OrangeCone implements ICone {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getConstituents() {
        return "OrangeCone";
    }
}
