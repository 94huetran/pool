public class BulletPool extends MemoryPool {
    @Override
    protected Object allocate() {
        /*tao mot doi tuong moi*/
        return new Bullet();
    }
}
