public class Application {
    public static void main(String[] args) {

        Gun gun = new Gun();
        System.out.println("Start game");
        gun.fire();
        System.out.println("Game over!");
        System.out.println("Total bullet used: " + Bullet.count);

        System.out.println("Start game");
        gun.fireInPool();
        System.out.println("Game over!");
        System.out.println("Total bullet used: " + Bullet.count);

    }

}
