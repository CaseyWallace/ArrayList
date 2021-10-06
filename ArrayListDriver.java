import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDriver{
    public static void main(String args[]) {
        ICollection<Integer> ints = new MyArrayList<>();
        Collection<Integer> toAdd = new ArrayList<Integer>();
        toAdd.add(1);
        ints.addAll(toAdd);
    }
}