package builder.v2;

public class Main {

    public static void main(String[] args) {

        UserExam userExam1 = UserExam.getBuilder()
                .setEnglishMarks(10)
                .setScienceMarks(15)
                .setMathsMarks(20)
                .setName("Sanket").build();

        UserExam userExam2 = UserExam.getBuilder()
                .setEnglishMarks(110)
                .setScienceMarks(15)
                .setMathsMarks(20)
                .setName("Gatha").build();

        System.out.println("done");
    }
}
