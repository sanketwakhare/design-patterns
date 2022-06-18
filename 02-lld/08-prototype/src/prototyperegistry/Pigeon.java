package prototyperegistry;

public class Pigeon extends Bird {

    private String color;

    public Pigeon() {
        super("pigeon");
    }

    public Pigeon(Pigeon old) {
        // copy parent attributes
        super(old);
        // copy current child attributes
        this.color = old.color;
    }

    @Override
    public Pigeon clone() {
        super.clone();
        return new Pigeon(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
