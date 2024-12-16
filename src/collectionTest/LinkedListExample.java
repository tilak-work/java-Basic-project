package collectionTest;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Dog");
        list.addFirst("Cat");
        list.addLast("Elephant");

        // Accessing elements
        System.out.println("First element: " + list.getFirst());

        // Removing elements
        list.removeFirst();
        list.removeLast();

        // Iterating
        System.out.println("LinkedList Elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
