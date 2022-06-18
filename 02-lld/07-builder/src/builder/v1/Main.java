package builder.v1;

public class Main {

    public static void main(String[] args) {

        UserExamParameters userExamParameters = new UserExamParameters();
        userExamParameters.mathsMarks = 20;
        userExamParameters.englishMarks = 10;
        userExamParameters.scienceMarks = 15;
        userExamParameters.name = "john";

        UserExam userExam = new UserExam(userExamParameters);
        System.out.println(userExam.getName());
        System.out.println(userExam.getEnglishMarks());
        System.out.println(userExam.getMathsMarks());
        System.out.println(userExam.getScienceMarks());
        System.out.println("done");
    }
}
