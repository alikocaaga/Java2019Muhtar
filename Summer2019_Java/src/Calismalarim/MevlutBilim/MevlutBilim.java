package Calismalarim.MevlutBilim;

import java.util.*;
import java.util.stream.IntStream;

public class MevlutBilim {
    public static void main(String[] args) {

        String string = "AAAABBFFFAAADDDEEEFFFBBFFFFXXXXAAAA";

        String[] strArray = string.split("");
        Map<String, Integer> map = new HashMap<>();
        //key : A, value:1;
        for (String st : strArray) {
            if (!map.containsKey(st)) {
                map.put(st, 1);

            } else {
                map.put(st, map.get(st) + 1);
            }
        }
        System.out.println(map);

        /*
        f(x) = 2x+5;
        f(-1)= 2x -1 +5=3
         */
        String s = "osman";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
        String s1 = "asdfghk";
        String s2 = "hgfdsahkjhgjhg";
        System.out.println(same(s1,s2));

        int n = 11;
        System.out.println(rever(s));
        System.out.println(streamreverse(s));
        System.out.println(topla(n));

    }

    public static String rever(String str) {
        var result = "";
        for (var i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }

    public static String streamreverse(String str) {
        return Arrays.stream(str.split(""))
                .reduce("", (x, y) -> y + x);
    }

    public static int topla(int n) {
        return IntStream.range(0, n).reduce(0, (x, y) -> x + y);
    }

    public static boolean same(String s1, String s2) {

        return Arrays.stream(s1.split(""))
                .allMatch(x -> s2.contains(x) && s1.contains(x));

    }


}
