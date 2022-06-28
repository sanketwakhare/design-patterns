package decorator.pizza.base;

import decorator.pizza.IBase;
import decorator.pizza.toppings.CheeseTopping;

public class CheeseCrust implements IBase {

    @Override
    public double getCost() {
        return 180;
    }

    @Override
    public String getIngredients() {
        return "CheeseCrust";
    }
}
