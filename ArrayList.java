import java.util.Collection;
import java.util.Iterator;

public class ArrayList<T extends Comparable<T>> implements ICollection<T> {
    public boolean add(T toAdd) {
        return false;
    }

    public boolean addAll(Collection<T> values) {
        return false;
    }

    public void clear() {

    }

    public boolean contains(T item) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public void updateAll(T oldValue, T newValue) {

    }

    public boolean remove(T item) {
        return false;
    }

    public int size() {
        return 0;
    }

    //What is this?
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}