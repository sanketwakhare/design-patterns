package userbuilder;

public class User {

    private String name;
    private int age;
    private String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static UserBuilder getBuilder() {
        return new UserBuilder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    static class UserBuilder {

        private String name;
        private int age;
        private String address;

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {

            // validate properties


            // create object
            return new User(this);
        }

    }
}
