package polymorphism;

import java.util.List;

public class Main {

    public static void changeAllPasswords(List<User> users) {
        for (User user : users) {
            user.changePassword();
            if(user instanceof Student) {
                Student s = (Student) user;
                s.solveProblem();
            }
        }
    }

    public static void main(String[] args) {
        User instructor = new Instructor();
        User student = new Student();
        User mentor = new Mentor();
        User user = new User();
        List<User> users = List.of(instructor, student, mentor, user);
        changeAllPasswords(users);
    }
}
