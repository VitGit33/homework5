package ai.skillo.task5;
import java.util.*;

public class QueueDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue to the dentist: " + queue);
        queue.removeFirst();
        System.out.println("First person arrived: " + queue);
        queue.addLast(4);
        queue.addLast(5);
        System.out.println("Two added: " + queue);
        queue.pop();
        System.out.println("Second person arrived: " + queue);
        queue.add(6);
        queue.add(7);
        System.out.println("Two added: " + queue);
        queue.remove();
        System.out.println("Third person arrived: " + queue);
        queue.pop();
        System.out.println("Forth person arrived: " + queue);
        System.out.println("Lunch time");
        System.out.println();


        Queue<Integer> q = new PriorityQueue();
        q.add(1);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(5);
        System.out.println(q);

        while (q.size() > 1) {
            q.remove();
            System.out.println(q);
        }

//        for (int i = q.size(); i >= 0; i-- ) {
//            q.remove(); // method poll doesn't work. Why?
//            System.out.println(q);
//            // in requirement says: remove until there is one left. How?
//
//        }

    }
}
