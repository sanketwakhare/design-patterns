package bullet;

import java.util.HashMap;
import java.util.Map;

/*Factory(with caching) can also be used here instead of registry*/
public class BulletRegistry {

    Map<BulletType, Bullet> bulletRegistry = new HashMap<>();

    public void addBullet(BulletType type, Bullet bullet) {
        bulletRegistry.put(type, bullet);
    }

    public Bullet getBullet(BulletType type) {
        return bulletRegistry.get(type);
    }
}
