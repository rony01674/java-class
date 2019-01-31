package setsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        //Create a hash set
        Set<String> set = new HashSet<>();

        //Adding string to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        //Displau the elements in the hash set
        for (Object element : set) {
            System.out.print(element.toString().toLowerCase() + " ");
        }
    }
}
