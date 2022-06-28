package decorator.pizza.base;

import decorator.pizza.IBase;

public class ThinCrust implements ICrust {

    ICrust crust;

    public ThinCrust() {
    }

    public ThinCrust(ICrust crust) {
        this.crust = crust;
    }

    @Override
    public double getCost() {
        if (crust == null) return 120;
        return crust.getCost() + 120;
    }

    @Override
    public String getIngredients() {
        String thinCrust = "ThinCrust";
        if (crust == null) return thinCrust;
        return crust.getIngredients() + "-" + thinCrust;
    }
}
