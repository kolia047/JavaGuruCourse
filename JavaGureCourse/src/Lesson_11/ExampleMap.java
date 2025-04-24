package Lesson_11;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Cat");
        map.put(2, "Dog");
        map.put(3, "Rap");
        map.put(4, "Mom");
        map.put(5, "Pap");
        map.put(6, "Bird");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(4));
        System.out.println(map.size());
        System.out.println("======================");

        for (Map.Entry m : map.entrySet()){

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
