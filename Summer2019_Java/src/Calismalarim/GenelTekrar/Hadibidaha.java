package Calismalarim.GenelTekrar;

import java.util.Scanner;

public class Hadibidaha {
    public static void main(String[] args) {



        System.out.println("Kac numara olsun ?");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a [] = new int[n];

        System.out.println("Rakamlari giriniz");
        for (int i = 0; i <n; i++){
            a[i]= scan.nextInt();

            }


        System.out.println("Even Numbers");
        for (int i = 0; i < n ; i++){
            if (a[i] % 2 != 0) {
                System.out.println(a[i]+" ");

            }

        }
        System.out.println("Odd Numbers");
        for (int i = 0; i < n ; i++){
            if (a[i] % 2 == 0) {
                System.out.println(a[i]+" ");

            }

        }
            }
        }







