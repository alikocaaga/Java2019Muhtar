package day15_Scanner_StringClass;


import java.util.Scanner;

public class TasksPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = scan.nextInt();

        System.out.println("Enter Second Number");
        int number2 = scan.nextInt();

        System.out.println("Enter Third Number");
        int number3 = scan.nextInt();

        int Largest = (number1 > number2 && number1 > number3) ? number1
                        : (number2 > number1 && number2 > number3) ? number2
                        : number3;

        System.out.println(Largest);


        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();

       String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        input.close();

    }
}
