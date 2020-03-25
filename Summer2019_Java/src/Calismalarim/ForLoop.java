package Calismalarim;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        String pass = input.nextLine();

        String email = "cybertek.batch12@gmail.com";
        String password = "Javengers";

        if( email.endsWith("@gmail.com")){
            if ((user.equalsIgnoreCase(email))&& pass.equals(password)){
                System.out.println("Loged in successfully");

            }else {
                System.out.println("Invalid password or email");
            }

        }else {
            System.out.println("it's not valid eamil address");
        }





    }
}
