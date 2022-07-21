package bullet;

/* Intrinsic */
public class Bullet {

    private final double size;
    private final String color;
    private final byte[] image;

    private final BulletType type;

    public Bullet(double size, String color, byte[] image, BulletType type) {
        this.size = size;
        this.color = color;
        this.image = image;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public byte[] getImage() {
        return image;
    }

    public BulletType getType() {
        return type;
    }
}
