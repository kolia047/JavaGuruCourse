package Lesson_11;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();  //List.of(25,32,36,5,4,88,99,7,8,9,5);

        list.add(9);
        list.add(1);
        list.add(2);
        list.add(11);
        list.add(9);
        list.add(25);
        list.add(99);
        list.set(4, 9999);
        System.out.println(list);
        System.out.println(list.get(2));
        list.sort((start, end) -> start - end);

        System.out.println(list);
        System.out.println("-----------------------");

        Set<Integer> set = new HashSet<>(); //
        Set<Integer> set1 = new TreeSet<>();

        set.add(9);
        set.add(1);
        set.add(2);
        set.add(11);
        set.add(1);
        set.add(25);
        set.add(99);
        System.out.println(set);



        set1.add(9);
        set1.add(1);
        set1.add(9);
        set1.add(2);
        System.out.println(set1);



    }
}
