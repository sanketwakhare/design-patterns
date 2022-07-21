package abstractclasses;

public class Student extends User {

    private String batchName;

    public Student() {
        super("student");
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public void doSomething() {
        System.out.println("solve assignments");
    }
}
