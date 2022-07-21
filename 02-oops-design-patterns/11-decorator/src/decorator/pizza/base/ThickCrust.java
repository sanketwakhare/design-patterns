package decorator.pizza.base;

import decorator.pizza.IBase;

public class ThickCrust implements ICrust {

    ICrust crust;

    public ThickCrust() {
    }

    public ThickCrust(ICrust crust) {
        this.crust = crust;
    }
    
    @Override
    public double getCost() {
        if (crust == null) return 150;
        return crust.getCost() + 150;
    }

    @Override
    public String getIngredients() {
        String thickCrust = "ThickCrust";
        if (crust == null) return thickCrust;
        return crust.getIngredients() + "-" + thickCrust;
    }
}
