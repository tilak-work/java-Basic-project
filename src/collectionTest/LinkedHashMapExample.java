package collectionTest;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Iterating (Maintains Insertion Order)
        System.out.println("LinkedHashMap Elements:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
