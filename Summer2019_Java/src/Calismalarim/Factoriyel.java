package Calismalarim;

import java.util.Scanner;

public class Factoriyel {
    public static void main(String[] args) {


        Scanner factor = new Scanner(System.in);
        int factoriyel =1;
        int number= factor.nextInt();

        for (int i = 1; i <= number; i++){
            factoriyel = factoriyel * i;
        }
        System.out.println(factoriyel);
    }
}
