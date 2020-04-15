package Calismalarim.MevlutBilimKurs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqDublicateFrequency {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEEFFGGGAA";
        String[] string = str.replaceAll("\\s+", "").split("");
        Map<String, Integer> mapping = new HashMap<>();

        for (String s : string) {
            if (!mapping.containsKey(s)) {
                mapping.put(s, 1);
            } else {
                mapping.put(s, mapping.get(s) + 1);
            }

        }
        for (Map.Entry<String, Integer> map : mapping.entrySet()) {
            System.out.println("Kareket " + map.getKey() + " Deger " + map.getValue());
        }
        //Lambda ile
        String freque = mapping.entrySet().stream()
                .map(x -> x.getKey() + x.getValue())
                .collect(Collectors.joining());
        System.out.println(freque);

        //Ayri bir yol
        String frequency = "";
        System.out.println(mapping);
        for (Map.Entry<String, Integer> map : mapping.entrySet()) {
            frequency += map.getKey() + map.getValue();
        }
        System.out.println(frequency);
    }
}
