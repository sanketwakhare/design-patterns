package accessmodifiers.testpacakge;

import accessmodifiers.Student;

public class ProxyStudent extends Student {
    public static void main(String[] args) {
        ProxyStudent student = new ProxyStudent();
        student.setName("proxy");
        // protected can be accessed inside subclasses outside packages as well
        student.college = "abc";

        System.out.println(student.getName());
        System.out.println(student.getCollege());
    }
}
