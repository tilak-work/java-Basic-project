package collectionTest;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Adding elements
        queue.add(30);
        queue.add(10);
        queue.add(20);

        // Peeking and polling
        System.out.println("Top Element: " + queue.peek());
        System.out.println("Removing Element: " + queue.poll());

        // Iterating
        System.out.println("PriorityQueue Elements:");
        for (Integer num : queue) {
            System.out.println(num);
        }
    }
}
