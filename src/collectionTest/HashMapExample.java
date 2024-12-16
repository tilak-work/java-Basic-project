package collectionTest;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Accessing an element
        System.out.println("Value for key 2: " + map.get(2));

        // Removing an element
        map.remove(3);

        // Iterating
        System.out.println("HashMap Elements:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
