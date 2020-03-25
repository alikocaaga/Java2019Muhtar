package Calismalarim;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        System.out.println("Guess the password");
        String password = "Alican";
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();

        while (!guess.equals(password)){
            System.out.println("Guess the password,again ");
            guess = scan.nextLine();
        }
        System.out.println("Congrats!");



    }
}
