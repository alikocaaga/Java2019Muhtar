package Calismalarim.SavasAndFatih;

import com.google.gson.internal.$Gson$Preconditions;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(ReverseString("Osman"));

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        System.out.println(sb.length());

        String name = "Merhaba televole";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);

    }
    public static String ReverseString (String str){
        String Dondur = "";
        for( int i = str.length()-1; i>=0; i--){
            Dondur += str.charAt(i);
        }
        return Dondur;
    }



}
