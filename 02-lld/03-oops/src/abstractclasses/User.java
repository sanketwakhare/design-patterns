package abstractclasses;

public abstract class User {

    private final String type;
    private String name;
    private String email;

    User(String type) {
        this.type = type;
    }

    public void changeEmail() {
        System.out.println("change email from user class");
    }

    abstract public void doSomething();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
