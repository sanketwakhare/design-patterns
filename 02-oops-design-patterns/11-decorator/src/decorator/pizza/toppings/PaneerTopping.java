package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class PaneerTopping implements IBase {

    private final IBase base;

    public PaneerTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 100;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Paneer";
    }
}
