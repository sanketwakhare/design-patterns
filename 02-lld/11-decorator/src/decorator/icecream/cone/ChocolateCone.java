package decorator.icecream.cone;

import decorator.icecream.ICone;

public class ChocolateCone implements ICone {

    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getConstituents() {
        return "ChocolateCone";
    }
}
