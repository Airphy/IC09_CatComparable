import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
///ArrayList is a collection of related data under a single type that is dynamically sized.
        //Default capacity is 10
        //Dynamic size, can grow and shrink
        //If first ten are taken up, it will double in size but the second array is somewhere else, connected but distant, not contiguous

        ArrayList<Cat> clowder = new ArrayList<>();
        // or
        // List<Cat> clowder = new ArrayList<>();
        // List is a parent of all the list classes, LinkedList and ArrayList

        // Add cats to the ArrayList

        clowder.add(new Cat("Boba Pearl", "Tuxedo", 2));
        clowder.add(new Cat("Dino", "Black", 8));
        clowder.add(new Cat("Cole", "Orange", 6));
        clowder.add(new Cat("Lucy", "Orange", 8));
        clowder.add(new Cat("Winona", "Black", 3));

        // To remove an object, clowder.remove(2); or the name of the object if made seperately
        // When removing, the positioning of the data in the arrayList shifts accordingly, remove 3, 4 becomes 3.
        // clowder.clear(); nulls out all the objects in the array

        // With ArrayLists, they can be automatically sorted in ascending order
        System.out.println("\n~~~Unsorted Clowder of Cats~~~");
        // use for each loop with array lists
        // For each cat object (c) in the array list name clowder
        for(Cat c : clowder)
            System.out.println(c);


        Collections.sort(clowder);
        System.out.println("\n~~~Sorted Clowder of Cats~~~");
        for(Cat c : clowder) // for each
            System.out.println(c);

       //Traditional For Loop
       // for (int i = 0; i < clowder.size(); i++) {
      //      System.out.println(clowder.get(i));
      //  }

    }
}
