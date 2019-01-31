package javaclass_24_01_19;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {

    public static void main(String[] args) {
        //A custom operator that compares to String by their length.
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        
        // Create a Priority Queue with a custom Comparator
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        
        //Add items to a Priority Queue(ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");
        
        // Remove items from the Priority Queue(DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {            
            System.out.println("Length: "+namePriorityQueue.peek().length());
            System.out.println(namePriorityQueue.remove());
        }
    }
}
