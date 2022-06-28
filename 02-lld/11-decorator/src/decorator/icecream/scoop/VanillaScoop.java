package decorator.icecream.scoop;

import decorator.icecream.ICone;

public class VanillaScoop implements ICone {

    private final ICone baseCone;

    public VanillaScoop(ICone baseCone) {
        this.baseCone = baseCone;
    }

    @Override
    public double getCost() {
        return 30;
    }

    @Override
    public String getConstituents() {
        return baseCone.getConstituents() + "-" +
                "VanillaScoop";
    }
}
