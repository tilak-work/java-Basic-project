package java8Features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithMapExample {
    public static void main(String[] args) {
        // Source Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Filter entries with keys greater than 2
        Map<Integer, String> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getKey() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered Map: " + filteredMap);

        // Collect only values
        System.out.println("Values:");
        map.values().stream()
                .forEach(System.out::println);

        // Sort by key
        Map<Integer, String> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map by Key: " + sortedMap);
    }
}
