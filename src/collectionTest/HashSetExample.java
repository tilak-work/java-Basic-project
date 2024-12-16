package collectionTest;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, won't be added

        // Checking if an element exists
        System.out.println("Contains 20: " + set.contains(20));

        // Removing an element
        set.remove(30);

        // Iterating
        System.out.println("HashSet Elements:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
