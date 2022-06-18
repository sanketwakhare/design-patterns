package builder.v2;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {

        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {

            // validations
            if (this.englishMarks > 100 || this.mathsMarks > 100 || this.scienceMarks > 100) {
                throw new InvalidParameterException("marks cannot exceed 100");
            }
            if (this.englishMarks < 0 || this.mathsMarks < 0 || this.scienceMarks < 0) {
                throw new InvalidParameterException("marks cannot be less than 0");
            }

            // create object
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;
            return userExam;
        }
    }
}
