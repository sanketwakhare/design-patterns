package decorator.pizza.base;

import decorator.pizza.IBase;

public class FlatCrust implements ICrust {
    ICrust crust;

    public FlatCrust() {
    }

    public FlatCrust(ICrust crust) {
        this.crust = crust;
    }

    @Override
    public double getCost() {
        if (crust == null) return 100;
        return crust.getCost() + 100;
    }

    @Override
    public String getIngredients() {
        String flatCrust = "FlatCrust";
        if (crust == null) return flatCrust;
        return crust.getIngredients() + "-" + flatCrust;
    }
}
