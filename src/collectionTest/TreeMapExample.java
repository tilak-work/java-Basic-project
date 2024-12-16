package collectionTest;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(30, "Thirty");
        map.put(10, "Ten");
        map.put(20, "Twenty");

        // Iterating (Sorted Order)
        System.out.println("TreeMap Elements:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
