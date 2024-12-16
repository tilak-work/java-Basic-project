package java8Features;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C"));

        for (String item : list) {
            System.out.println(item);
            list.add("D");
        }
        System.out.println(list);
    }
}
