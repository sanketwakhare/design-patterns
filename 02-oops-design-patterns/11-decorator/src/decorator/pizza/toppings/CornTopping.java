package decorator.pizza.toppings;

import decorator.pizza.IBase;

public class CornTopping implements IBase {
    private final IBase base;

    public CornTopping(IBase base) {
        this.base = base;
    }

    @Override
    public double getCost() {
        return base.getCost() + 80;
    }

    @Override
    public String getIngredients() {
        return base.getIngredients() + "-" + "Corn";
    }
}
