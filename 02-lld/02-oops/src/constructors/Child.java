package constructors;

public class Child {
    private String name;

    public Child() {
        // default constructor
        System.out.println("default constructor called");
        System.out.println("Hello World");
    }

    public Child(String name) {
        System.out.println("Hello " + name);
    }
}
