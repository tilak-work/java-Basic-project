package collectionTest;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("One");
        set.add("Two");
        set.add("Three");

        // Iterating (Maintains Insertion Order)
        System.out.println("LinkedHashSet Elements:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
