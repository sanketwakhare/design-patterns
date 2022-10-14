package practise;

public class Eagle extends Bird {

    private String sound;

    public Eagle(String name) {
        super(name, "Accipitridae");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Eagle eagle = (Eagle) super.clone();
        eagle.sound = this.sound;
        return eagle;
    }
}
