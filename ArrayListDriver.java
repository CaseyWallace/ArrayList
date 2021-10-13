import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDriver{
    public static void main(String args[]) { //TODO: TEST THE FOLLOWING:ITERATOR

        //Initializes the MyArrayList and Array List to be added.  Tests the toAdd method.

        ICollection<Integer> ints = new MyArrayList<>();
        Collection<Integer> toAdd = new ArrayList<Integer>();
        toAdd.add(6);
        toAdd.add(8);
        toAdd.add(7);
        toAdd.add(5);
        toAdd.add(3);
        toAdd.add(0);
        toAdd.add(9);
        ints.addAll(toAdd);
        System.out.println("This is the initial ArrayList: " + ints.toString());
        System.out.println("The size of the array is " + ints.size());
        System.out.println("");
        
        //Tests adding a null value.

        ints.add(null);
        System.out.println("This is the ArrayList after adding a null value. " + ints.toString());
        System.out.println("The size of the array after adding one more element is " + ints.size());
        System.out.println("");
        
        //Tests the add method, and makes sure the size counter is updated.

        ints.add(1000);
        System.out.println("This is the ArrayList after adding another value: " + ints.toString());
        System.out.println("The size of the array after adding one more element is " + ints.size());
        System.out.println("");

        //Tests the contains method if true.
        if (ints.contains(7)) {
            System.out.println("7 is in the myArrayList!");
        } else {
            System.out.println("7 is not in the myArrayList!");
        }
        System.out.println("");

        //Tests the contains method if false.
        if (ints.contains(81)) {
            System.out.println("81 is in the myArrayList!");
        } else {
            System.out.println("81 is not in the myArrayList!");
        }
        System.out.println("");

        //Tests the updateAll method
        ints.add(7);
        ints.updateAll(7, 100);
        System.out.println("All instances of 7, including the one just added, have been updated to 100!: " + ints.toString());
        System.out.println("");

        //Tests the remove method.
        ints.remove(3);
        System.out.println("The first instance of 3 has been removed!: " + ints.toString());
        System.out.println("");

        //Tests the isEmpty method.
        if (ints.isEmpty()){
            System.out.println("The ArrayList is empty!");
        } else {
            System.out.println("The ArrayList is not empty!");
        }
        System.out.println("");

        //Tests the clear method, then retests the isEmpty method.
        ints.clear();
        if (ints.isEmpty()){
            System.out.println("The ArrayList is empty!");
        } else {
            System.out.println("The ArrayList is not empty!");
        }
        System.out.println(ints.toString());
        System.out.println("");

        //Creates movies to add to a new myArrayList, adds the movies, and prints out the list of movies.
        Movie a = new Movie("Ferris Bueller's Day Off", 1986);
        Movie b = new Movie("Titanic", 1997);
        Movie c = new Movie("Rocky", 1976);
        Movie d = new Movie("Jaws", 1975);
        Movie e = null;

        ICollection<Movie> movies = new MyArrayList<>();
        movies.add(a);
        movies.add(b);
        movies.add(c);
        movies.add(d);
        movies.add(e);

        for(var m : movies) {
            System.out.println(m);
        }
    }
}