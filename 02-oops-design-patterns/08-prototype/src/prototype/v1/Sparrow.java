package prototype.v1;

public class Sparrow extends Bird {

    private String sound;

    public Sparrow() {
        super("sparrow");
    }

    public Sparrow(Sparrow old) {
        // copy parent attributes
        super(old);
        // copy current child attributes
        this.sound = old.sound;
    }

    @Override
    public Sparrow clone() {
        super.clone();
        return new Sparrow(this);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

