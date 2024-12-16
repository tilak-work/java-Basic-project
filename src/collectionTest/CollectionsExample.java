package collectionTest;
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A"); // Allows duplicates
        System.out.println("List: " + list);

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Ignores duplicates
        System.out.println("Set: " + set);

        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Map: " + map);
    }
}
