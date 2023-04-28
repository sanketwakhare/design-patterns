package userbuilder;

public class Driver {
    public static void main(String[] args) {
        User.UserBuilder builder = User.getBuilder();
        User sanket1 = builder.setName("sanket1")
                .setAge(31)
                .setAddress("some address")
                .build();

        User sanket2 = builder.setName("sanket2")
                .setAge(31)
                .setAddress("some address")
                .build();

        System.out.println(sanket1);
        System.out.println(sanket2);
    }
}
