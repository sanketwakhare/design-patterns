package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class TomatoTopping implements IBase {

    private final IBase base;

    public TomatoTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 50;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Tomato";
    }
}
