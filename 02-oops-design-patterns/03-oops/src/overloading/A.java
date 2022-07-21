package overloading;

public class A {
    public void print() {
        System.out.println("Hello World");
    }

    //  method overloading - compile time polymorphism
    public void print(String name) {
        System.out.println("Hello " + name);
    }

    // compile error - not allowed as compiler will not be able to decide what to return
//    public String print(String name) {
//        System.out.println("Hello " + name);
//    }
}
