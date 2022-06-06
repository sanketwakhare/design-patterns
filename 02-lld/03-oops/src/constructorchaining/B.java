package constructorchaining;

public class B extends A {

    B() {
        super("test");
        System.out.println("constructor of B");
    }
}
