package Calismalarim;

import day14_Scanner.ScannerClass;

import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        String password = "Nail";
        System.out.println("Guess the password");

        Scanner input = new Scanner(System.in);

        String guess = input.nextLine();



        if (password.equals(guess)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Good Bye");
        }
    }
}