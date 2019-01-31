package setsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        //creating a hash set
        Set<String> set = new HashSet<>();

        //Add string to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);

        //Display the element in the hash set
        for (String s : set) {
            System.out.println(s.toUpperCase() + " ");
        }
    }

}
