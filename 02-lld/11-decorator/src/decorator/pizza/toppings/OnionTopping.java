package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class OnionTopping implements IBase {

    IBase base;

    public OnionTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 50;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Onion";
    }
}
