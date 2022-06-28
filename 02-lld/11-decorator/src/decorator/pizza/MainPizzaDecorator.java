package decorator.pizza;

import decorator.pizza.base.CheeseCrust;
import decorator.pizza.base.FlatCrust;
import decorator.pizza.base.ThickCrust;
import decorator.pizza.base.ThinCrust;
import decorator.pizza.toppings.*;

public class MainPizzaDecorator {

    public static void main(String[] args) {

        // we can create prototype registry for pizza bases
        ThinCrust thinCrust = new ThinCrust();
        ThickCrust thickCrust = new ThickCrust();
        FlatCrust flatCrust = new FlatCrust();
        CheeseCrust cheeseCrust = new CheeseCrust();

        System.out.println("----------------------------");
        // Paneer-Onion Thin crust pizza
        PaneerTopping paneerTopping = new PaneerTopping(thinCrust);
        OnionTopping paneerOnion = new OnionTopping(paneerTopping);
        System.out.println(paneerOnion.getIngredients());
        System.out.println(paneerOnion.getCost());
        System.out.println("----------------------------");

        // Corn-Chicken Cheese Burst crust pizza
        CornTopping cornTopping = new CornTopping(cheeseCrust);
        ChickenTopping chickenCornTopping = new ChickenTopping(cornTopping);
        CheeseTopping chickenCornCheeseBurst = new CheeseTopping(chickenCornTopping);
        System.out.println(chickenCornCheeseBurst.getIngredients());
        System.out.println(chickenCornCheeseBurst.getCost());
        System.out.println("----------------------------");

        // Chicken Thick Crust pizza
        ChickenTopping chickenThickPizza = new ChickenTopping(thickCrust);
        System.out.println(chickenThickPizza.getIngredients());
        System.out.println(chickenThickPizza.getCost());
        System.out.println("----------------------------");

        // (Double Crust Pizza without sandwich)

        // Cheese Crust + Thin Crust + Paneer Pizza
        CheeseCrust cheeseThinCrust = new CheeseCrust(thinCrust);
        PaneerTopping paneerCheeseThinCrustPizza = new PaneerTopping(cheeseThinCrust);
        System.out.println(paneerCheeseThinCrustPizza.getIngredients());
        System.out.println(paneerCheeseThinCrustPizza.getCost());
        System.out.println("----------------------------");
    }
}
