package accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // default can be accessed within same package
        student.name = "Sanket";
        // protected can be accessed within same package or in subclasses outside package
        student.college = "abc";
        // private can not be accessed outside same class
        // student.age = 10;
        // public can be accessed from anywhere
        System.out.println(student.getName());
    }
}
