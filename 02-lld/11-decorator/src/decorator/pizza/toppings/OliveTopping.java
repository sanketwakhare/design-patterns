package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class OliveTopping implements IBase {

    IBase base;

    public OliveTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 80;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Olive";
    }
}
