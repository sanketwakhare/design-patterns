package bullet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BulletRegistry registry = new BulletRegistry();
        //
        for (BulletType type : BulletType.values()) {
            registry.addBullet(type, new Bullet(5, "red", new byte[1000], type));
        }

        List<MovingBullet> bullets = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            BulletType type = BulletType.SMALL;
            if (i % 3 == 0) type = BulletType.LARGE;
            else if (i % 10 == 0) type = BulletType.MEDIUM;
            bullets.add(new MovingBullet(
                    50,
                    23,
                    32,
                    registry.getBullet(type)));
        }
    }
}
