package studentbuilder;

import java.security.InvalidParameterException;

public class Student {

    private final String name;
    private final String address;

    private Student(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private String name;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
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
            return new Student(this);
        }
    }
}
