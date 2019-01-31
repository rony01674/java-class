package setsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {

    public static void main(String[] args) {
        //Create set1
        Set<String> set1 = new HashSet<>();

        //Add string to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is :" + set1);
        System.out.println(set1.size() + " element in set 1");

        //Delete string from set1
        set1.remove("London");
        System.out.println("\nset1 is " + set1);

        //create set2
        Set<String> set2 = new HashSet<>();

        //Add string to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\nIs Taipei is set2? " + set2.contains("Taipei"));

        set1.addAll(set2);

        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

        set1.removeAll(set2);

        System.out.println("After removign set2 from set1, set1 is " + set1);

        set1.retainAll(set2);

        System.out.println("After removing common elements in set2 from set1, set1 is " + set1);
    }
}
