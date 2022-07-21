package prototype.v1;

public class Bird implements Cloneable<Bird> {

    String name;

    String type;

    public Bird() {
    }

    public Bird(String type) {
        this.type = type;
    }

    public Bird(Bird old) {
        super();
        this.name = old.name;
        this.type = old.type;
    }

    @Override
    public Bird clone() {
        return new Bird(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
