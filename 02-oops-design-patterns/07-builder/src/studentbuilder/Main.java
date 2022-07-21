package studentbuilder;

public class Main {

    public static void main(String[] args) {

        Student student1 = Student.getBuilder()
                .setName("Sanket")
                .setAddress("dummy")
                .build();

        Student student2 = Student.getBuilder()
                .setName("John Dow")
                .setAddress("test")
                .build();
        System.out.println("done");
    }
}
