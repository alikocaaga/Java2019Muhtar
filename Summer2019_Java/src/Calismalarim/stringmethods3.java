package Calismalarim;

import java.util.Scanner;

public class stringmethods3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First and Last Name");
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        String fullName = firstName+ " "+ lastName;
        System.out.println(fullName);

        String firstName1 = "firstName.charAt(0)";
        String lastName1 = "lastName.charAt(0)";
        String fullname2 = firstName1+lastName1;

        System.out.println(fullname2);




    }

}
