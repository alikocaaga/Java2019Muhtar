package Calismalarim;

import java.util.Scanner;

public class ekrem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String isim = input.nextLine();
        String soyisim = input.nextLine();

        String fullname = isim + " " + soyisim;
        System.out.println(fullname.toUpperCase());
    }
}
