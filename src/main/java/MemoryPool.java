import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_items = new LinkedList<>();

    public void freeItem(T item) {/*giai phong mot doi tuong*/
        free_items.add(item);
    }

    public T newItem() {
        /*cung cap mot doi tuong*/
        T out = null;
        if (free_items.size() == 0) {
            out = allocate();
        }else {
            out = free_items.getFirst();
            free_items.removeFirst();
        }
        return out;
    }

    protected abstract T allocate();
}
