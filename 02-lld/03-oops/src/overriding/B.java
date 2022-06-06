package overriding;

public class B extends A {
    // method overriding - same signature as method of parent
    @Override
    public void doSomething() {

        // if you want to call method of parent class, use super
        super.doSomething();
        System.out.println("I am B");
    }

//    compile error
//    public int doSomething() {
//        return 1;
//    }
}
