package Calismalarim;

public class If_withoutCurlybraked {
    public static void main(String[] args) {

        /*
        declare 3 numbers
        if n1 and n2 are equal
        => n1&n2 are equal
         if n3 and n1 are equal
        => n3&n1 are equal
         if n2 and n3 are equal
        => n2&n3 are equal
        if all equal ==> all equal

        if none of them are equal ==> none of them are equal
        Do not use single if statement
         */

        int n1 = 10;
        int n2 = 10;
        int n3 = 10;

        if (n1 == n2) {
            System.out.println("n1 equal n2");
        } else if (n2 == n3) {
            System.out.println("n2 equal n3");
        } else if (n1 == n3) {
            System.out.println("n1 equal n3");
        } else if (n1 == n2 && n2 == n3 && n1 == n3) {
            System.out.println("All equal");
        } else {
            System.out.println("non equal");
        }

        if (false)
            if (false)
                if (true)
                    System.out.println("Hello");
                else
                    System.out.println("Hi");
            else
                System.out.println("Hi Hello");
        else
            System.out.println("invalid");


        int grade = 101;
        if (grade <= 100 && grade >= 0)
            if (grade >= 90)
                System.out.println("A");
            else if (grade >= 80)
                System.out.println("B");
            else if (grade >= 70)
                System.out.println("C");
            else if (grade >= 60)
                System.out.println("D");
            else
                System.out.println("E");
        else
            System.out.println("Invalid");


    }

}

