package practise;

public class Bird implements Cloneable {
    private String birdType;
    private String name;

    public Bird(String name, String birdType) {
        this.name = name;
        this.birdType = birdType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Bird bird = (Bird) super.clone();
        bird.name = this.name;
        bird.birdType = this.birdType;
        return bird;
    }
}
