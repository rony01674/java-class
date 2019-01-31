package setsAndMaps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        //Create a hash set
        Set<String> set = new HashSet<>();
        
        //Add String to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("Sorted tree set: "+treeSet);
        
        //Use the methods in SortedSet interface
        System.out.println("first(): "+treeSet.first());
        System.out.println("last(): "+treeSet.last());
        System.out.println("headSet(\"New York\"): "+treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): "+treeSet.tailSet("New York"));
        
        //Use the methods in NavigableSet interface
        
    }
}
