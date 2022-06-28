package decorator.icecream.scoop;

import decorator.icecream.ICone;

public class ChocolateScoop implements ICone {

    private final ICone baseCone;

    public ChocolateScoop(ICone baseCone) {
        this.baseCone = baseCone;
    }

    @Override
    public double getCost() {
        return baseCone.getCost() + 50;
    }

    @Override
    public String getConstituents() {
        return baseCone.getConstituents() + "-" +
                "ChocolateScoop";
    }
}
