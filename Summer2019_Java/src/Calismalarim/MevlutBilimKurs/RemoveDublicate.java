package Calismalarim.MevlutBilimKurs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDublicate {
    public static void main(String[] args) {

        String str="AAABBBAABCDEEEFAA";//A3B4C1D1E3F1-CF-ABCDEF
        String[] string=str.replaceAll("\\s+", "").split("");

        Map<String,Integer> mapping=new HashMap<>();

        for(String s:string) {
            if(!mapping.containsKey(s)) {
                mapping.put(s, 1);
            }else {
                mapping.put(s,mapping.get(s)+1);
            }
        }

/*

        String frequ=mapping.entrySet().stream()
                .map(x->x.getKey()+x.getValue())
                .collect(Collectors.joining());
        System.out.println("Lambda ile = "+frequ);



 */

       String removeDup="";
        System.out.println(mapping);
        for(Map.Entry<String, Integer> map:mapping.entrySet()) {

            removeDup+=map.getKey();

        }
        System.out.println(removeDup);



    }
}

