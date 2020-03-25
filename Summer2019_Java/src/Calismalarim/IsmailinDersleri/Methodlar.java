package Calismalarim.IsmailinDersleri;

import java.util.ArrayList;

public class Methodlar {

    public static void print10words(String string, int x) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I love " + string + " " + x);
        }
    }

    public static ArrayList<String> myArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ali");
        arrayList.add("Ismail");
        arrayList.add("Hafsa");
        arrayList.add("Kezban");
        return arrayList;
    }

    public static void main(String[] args) {

        print10words("my Hatun", 21);

        System.out.println(myArrayList());
    }
}
