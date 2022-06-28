package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class CheeseTopping implements IBase {

    IBase base;

    public CheeseTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 120;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Cheese";
    }
}
