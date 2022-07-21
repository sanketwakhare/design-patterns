package overriding;

public class Main {

    public static void main(String[] args) {

        B b = new B();
        // calls method of child B
        b.doSomething();

        A a = new A();
        // calls method of child A
        a.doSomething();
    }
}
