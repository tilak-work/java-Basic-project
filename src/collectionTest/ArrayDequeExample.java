package collectionTest;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("Start");
        deque.addLast("Middle");
        deque.addLast("End");

        // Removing elements
        deque.removeFirst();
        deque.removeLast();

        // Iterating
        System.out.println("ArrayDeque Elements:");
        for (String item : deque) {
            System.out.println(item);
        }
    }
}
