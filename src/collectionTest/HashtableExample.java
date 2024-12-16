package collectionTest;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding elements
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        // Accessing elements
        System.out.println("Value for key 2: " + table.get(2));

        // Removing elements
        table.remove(3);

        // Iterating
        System.out.println("Hashtable Elements:");
        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }
}
