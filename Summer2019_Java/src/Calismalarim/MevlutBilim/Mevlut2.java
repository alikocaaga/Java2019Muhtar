package Calismalarim.MevlutBilim;

import java.util.*;

public class Mevlut2 {
    public static void main(String[] args) {
        int a = 5;
        String s = "ali";
        char ch = 's';
        double d = 3.5;
        float f = 45.3f;

        var as = 5;
        var as2 = "osman";
        var as3 = 3.5;
        var f2 = 45.5f;


        for (var i = 1; i <= 10; i++) {
            System.out.print(" " + i + (i * 3));

        }
        System.out.println("");
        int[] arr = new int[10];
        String[] kitaplar = {"A Kitap", "B kitap", "C Kitap"};
        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(kitaplar));
        for (String se : list)
        {
            System.out.println(se);
        }
        String string = "AAASSSDDDFFFREEEFFGGDD";

        String [] strArray = string.split("");
        Map<String,Integer> map = new HashMap<>();
        for (String st : strArray){
            if (!map.containsKey(st)){
                map.put(st,1);
            }else {
                map.put(st,map.get(st)+1);
            }
        }
        System.out.println(map);

    }




}