package day10_ifStatement;

public class ilhansClass {

    public static void main(String[] args) {

        int number = 10;
        System.out.println(number);
        boolean check = true;
        boolean check1 = false;

        if (!check || check1 || false) {
            System.out.println("This is my if block");
            number = 1;
        } else if (check1 && check && true) {
            System.out.println("This is my else if block");
            number = 2;
        } else if (check) {
            System.out.println("This is my else if block 2");
            number = 3;
        } else {
            System.out.println("This is my else block");
            number = 4;
        }
        System.out.println("number = " + number);


            /*
    Methods -----------------------------
    length() // finds the length of string
    toUpperCase() // makes your letters all upper case
    toLowerCase() // makes your letters all lower case
    substring() // Extract substring from string
    charAt() // returns a single character at a specified location
    equals() // compare if two string is identical
    */

            String variable = "Ali Kocaaga";
        System.out.println ("Hello Silicon = "+variable);
        System.out.println(variable.length());
        System.out.println(variable.toLowerCase());
        System.out.println(variable.toUpperCase());
        System.out.println(variable.charAt(7));
        System.out.println(variable.contains("li "));
        System.out.println(variable.trim().substring(1,8));
        System.out.println(variable.equals("Ali"));
        System.out.println(variable.replace("Ali", "Osman"));
        System.out.println(variable.replaceAll("Osman Kocaaga", "Ismail Kocaaga"));
        



    }
}

