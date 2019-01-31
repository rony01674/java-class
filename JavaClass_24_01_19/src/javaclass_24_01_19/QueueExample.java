package javaclass_24_01_19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Add elements (0,1,2,3,4) to Queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        //Display contents of the queue
        System.out.println("Elements of Queue: " + q);
        //To remove the head of queue
        int removebele = q.remove();
        System.out.println("Remove element: " + removebele);
        System.out.println(q);
        //To view the head of queue
        int head = q.peek();
        System.out.println("Head of queue: " + head);
        //Rest all methods of collection interface
        //Like size and contains can be used with this
        //Implementation
        int size = q.size();
        System.out.println("Size of queue: " + size);
    }

}
