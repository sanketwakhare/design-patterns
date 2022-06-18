package builder.v1;

import java.security.InvalidParameterException;

/**
 * issues: constructor is having validation code,
 * can validation and object creation logic be moved to separate class? -> yes
 * <p>
 * solution: use builder class
 */
public class UserExam {
    private final int englishMarks;
    private final int mathsMarks;
    private final int scienceMarks;
    private final String name;

    UserExam(UserExamParameters userExamParameters) {

        // validations
        if (userExamParameters.englishMarks > 100 || userExamParameters.mathsMarks > 100 || userExamParameters.scienceMarks > 100) {
            throw new InvalidParameterException("marks cannot exceed 100");
        }
        if (userExamParameters.englishMarks < 0 || userExamParameters.mathsMarks < 0 || userExamParameters.scienceMarks < 0) {
            throw new InvalidParameterException("marks cannot be less than 0");
        }

        // copy attributes
        this.englishMarks = userExamParameters.englishMarks;
        this.mathsMarks = userExamParameters.mathsMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
        this.name = userExamParameters.name;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public String getName() {
        return name;
    }
}
