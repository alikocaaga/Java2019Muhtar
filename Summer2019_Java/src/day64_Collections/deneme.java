package day64_Collections;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
        Integer[] arr = {10, 10, 20, 20, 30, 30, 30, 100};
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(arr));

        Set<Integer> linkedhash = new LinkedHashSet<>();
        for (int each : list) {
            linkedhash.add(each);

        }
        System.out.println(linkedhash);
    }
}