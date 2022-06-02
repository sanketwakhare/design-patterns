public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sanket");
        s1.setCourseStatus("ACTIVE");
        System.out.println(s1);

        // pause course
        s1.pauseCourse();
        System.out.println(s1);
    }
}
