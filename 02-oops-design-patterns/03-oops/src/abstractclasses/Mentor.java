package abstractclasses;

public class Mentor extends User {

    private String company;

    Mentor() {
        super("mentor");
    }

    @Override
    public void doSomething() {
        System.out.println("take mock interviews");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
