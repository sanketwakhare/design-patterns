package inheritance;

public class Main {

    public static void main(String[] args) {
        Mentor mentor = new Mentor();
        mentor.setName("abc");
        mentor.setCompany("Scaler");
        System.out.println(mentor.getName() + " " + mentor.getCompany());

        Student student = new Student();
        student.setEmail("student@scaler.com");
        student.setBatch("2021");
        System.out.println(student.getEmail() + " " + student.getBatch());
    }
}
