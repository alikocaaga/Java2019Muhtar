package Calismalarim;

import java.util.Scanner;

public class ForLoop_Dublicate {
    public static void main(String[] args) {

        String str = "Cybertek School,  System.out.println(count); System.out.println(count); " +
                "SchoolSchoolSchoolSchoolSchoolSchoolSystem.out.println(count);" +
                "School is good, School is perfect, School is knowladable.";
//School
//012345 =6
        int count = 0;

        for (int i = 0; i < str.length() - 5; i++) {
            if (str.substring(i, i + 6).equals("School")) {
                count++;
            }
        }

        System.out.println(count);

        String word = "I have a book,do do do do do do  yo have I I I I I any book? Yes I have a book";

        int num =0;
        for(int j=0; j <word.length()-1;j++){
            if(word.substring(j, j+2).equals("do")){
                num++;
            }
        }
        System.out.println(num);




        String world = "Ali veli Ali veli Ali Ali veli";

         int adet = 0;
         for(int i =0; i< world.length()-2;i++){
             if(world.substring(i, i+3).equals("Ali")){
                 adet ++;
             }
         }
        System.out.println(adet);



























    }
}
