package decorator.pizza.base;

import decorator.pizza.IBase;
import decorator.pizza.toppings.CheeseTopping;

public class CheeseCrust implements ICrust {

    ICrust crust;

    public CheeseCrust() {
    }

    public CheeseCrust(ICrust crust) {
        this.crust = crust;
    }

    @Override
    public double getCost() {
        if (crust == null) return 180;
        return crust.getCost() + 180;
    }

    @Override
    public String getIngredients() {
        String cheeseBurst = "CheeseCrust";
        if (crust == null) return cheeseBurst;
        return crust.getIngredients() + "-" + cheeseBurst;
    }
}
