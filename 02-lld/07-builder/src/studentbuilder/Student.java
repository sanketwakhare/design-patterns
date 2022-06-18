package studentbuilder;

import java.security.InvalidParameterException;

public class Student {

    private String name;
    private String address;

    private Student() {
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {

        private String name;
        private String address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            // validations
            if (this.name.length() < 6) {
                throw new InvalidParameterException("name should have at least 6 characters");
            }
            if (this.address.length() == 0) {
                throw new InvalidParameterException("address should not be empty");
            }

            // object creation
            Student student = new Student();
            student.name = this.name;
            student.address = this.address;
            return student;
        }
    }
}
