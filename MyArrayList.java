import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements ICollection<T> {

    private int size = 0;
    private T[] list;

    //COMPLETE
    @SuppressWarnings("unchecked")
    public MyArrayList (){
        list = (T[]) new Object[2];
    }

    //COMPLETE
    public boolean add(T toAdd) {
        if(size == list.length - 1){
            list = expand(list);
        }
        list[size] = toAdd;
        size++;
        return true;
    }

    //COMPLETE
    @SuppressWarnings("unchecked")
    public boolean addAll(Collection<T> values) {
        for(int i = 0; i < values.size(); i++){
            add((T) values.toArray()[i]);
        }
        return true;
    }

    //COMPLETE
    public void clear() {
        size = 0;
    }

    //COMPLETE
    public boolean contains(T item) {
        boolean contains = false;
        for(int i = 0; i < size; i++){
            if (list[i] == item){
                contains = true;
            }
        }
        return contains;
    }

    //COMPLETE
    public boolean isEmpty() {
        return(size == 0);
    }

    //COMPLETE
    public void updateAll(T oldValue, T newValue) {
        for(int i = 0; i < size; i++){
            if (list[i] == oldValue){
                list[i] = newValue;
            }
        }
    }

    //COMPLETE
    public boolean remove(T item) {
        boolean success = false;
        if (contains(item)){
            success = true;
            int index = -1;
            for(int i = 0; i < size; i++){
                if (list[i] == item){
                    list[i] = null;
                    index = i;
                    break;
                }
            }
            for(int i = index; i < size - 1; i++){
                list[i] = list[i + 1]; 
            }
            size--;
        }
        return success;
    }

    //COMPLETE
    public int size() {
        return size;
    }

    //TODO: Figure out what this is and how to do it.
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    //COMPLETE
    public T get(int index) {
        return list[index];
    }

    //COMPLETE
    @SuppressWarnings("unchecked")
    private T[] expand(T[] input){
        T[] newTArray = (T[])new Object[(input.length * 2)];
        for(int i = 0; i < input.length; i++){
            newTArray[i] = input[i];
        }
        return newTArray;
    }
}