package Calismalarim;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        System.out.println(arrayList.size());

        //add

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(300);


        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));

    }
}
