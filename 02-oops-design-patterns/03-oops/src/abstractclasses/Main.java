package abstractclasses;

public class Main {

    public static void main(String[] args) {
        User student = new Student();
        student.doSomething();

        User mentor = new Mentor();
        mentor.doSomething();
    }
}
