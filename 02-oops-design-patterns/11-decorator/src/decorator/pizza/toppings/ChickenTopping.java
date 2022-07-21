package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class ChickenTopping implements IBase {

    IBase base;

    public ChickenTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 120;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Chicken";
    }
}
