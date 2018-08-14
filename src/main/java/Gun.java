import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;
    private static Gun gun = new Gun();

    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = (Bullet) pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.println(""+pp.getPosition());
                if (pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                }
            }
            System.out.println("haha em la hue ahihi");
        }
    }

    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.println("" + pp.getPosition());
                if (pp.getPosition() == 0) {
                    plist.remove(pp);
                }

            }
            System.out.println("ahihi do ngoc");
        }
    }

}
