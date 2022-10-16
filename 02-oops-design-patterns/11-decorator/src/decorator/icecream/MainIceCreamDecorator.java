package decorator.icecream;

import decorator.icecream.cone.ChocolateCone;
import decorator.icecream.cone.OrangeCone;
import decorator.icecream.scoop.ChocolateScoop;
import decorator.icecream.scoop.MangoScoop;
import decorator.icecream.scoop.VanillaScoop;

public class MainIceCreamDecorator {

    public static void main(String[] args) {

        // basic ice cream variant - orange cone + vanilla
        OrangeCone orangeCone = new OrangeCone();
        VanillaScoop vanillaScoop = new VanillaScoop(orangeCone);
        System.out.println(vanillaScoop.getConstituents() + " " + vanillaScoop.getCost());

        // chocolate cone + chocolate scoop
        ChocolateCone chocolateCone = new ChocolateCone();
        ChocolateScoop chocolateScoop = new ChocolateScoop(chocolateCone);
        System.out.println(chocolateScoop.getConstituents() + " " + chocolateScoop.getCost());

        // vanilla cone + vanilla scoop + chocolate scoop
        ChocolateScoop vanillaChocolate = new ChocolateScoop(vanillaScoop);
        System.out.println(vanillaChocolate.getConstituents() + " " + vanillaChocolate.getCost());

        // orange cone + mango scoop + chocolate scoop
        MangoScoop mangoScoop = new MangoScoop(orangeCone);
        ChocolateScoop mangoAndChocolateScoop = new ChocolateScoop(mangoScoop);
        System.out.println(mangoAndChocolateScoop.getConstituents() + " " + mangoAndChocolateScoop.getCost());
    }
}
