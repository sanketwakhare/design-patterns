package decorator.icecream.scoop;

import decorator.icecream.ICone;

public class MangoScoop implements ICone {

    private final ICone baseCone;

    public MangoScoop(ICone baseCone) {
        this.baseCone = baseCone;
    }

    @Override
    public double getCost() {
        return baseCone.getCost() + 60;
    }

    @Override
    public String getConstituents() {
        return baseCone.getConstituents() + "-" + "MangoScoop";
    }
}
