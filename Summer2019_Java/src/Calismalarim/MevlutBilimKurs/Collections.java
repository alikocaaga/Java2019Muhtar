package Calismalarim.MevlutBilimKurs;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
  /*      String[] names = {"Ali Kocaaga", "Ali Tokmak", "Mevlut Bilim", "Ali Kocaaga", "Ali Tokmak", "Mevlut Bilim"};

        System.out.println(Arrays.asList(names));

               for (String str : names) {
                    System.out.println("Adi Soyadi: " + str);
                }

                int[] numaralar = {1, 46, 8, 8, 90};


                for (int str : numaralar) {
                    System.out.println("Numaralar: " + str);
                }
*/
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(46);
        list.add(45);

        System.out.println(list);

        List<String> isim = new ArrayList<>();
        isim.add("Ali");
        isim.add("Alim");
        isim.add("Aliye");
        isim.add("Alican");
        System.out.println(isim);

        Map<String, Integer> isimNo = new HashMap<>(); //double olanlari gostermiyor
        isimNo.put("Alim", 100);
        isimNo.put("Ali", 200);
        isimNo.put("Mevlut", 300);
        isimNo.put("Ali", 500);
        System.out.println(isimNo.size());
        System.out.println(isimNo.isEmpty());


        for (Map.Entry<String, Integer> map : isimNo.entrySet()) {
            System.out.println("Isim :" + map.getKey() + " Numara: " + map.getValue());
        }

        //isimNo.entrySet().forEach(x->System.out.println("Isim :"+x.getKey()+",Numara :"+x.getValue()));


    }


}








