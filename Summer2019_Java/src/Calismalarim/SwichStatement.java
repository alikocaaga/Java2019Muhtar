package Calismalarim;

public class SwichStatement {
    public static void main(String[] args) {
/*
        for (int i = 9; i >= 0; i--) {
            for (int k = i; k >= 0; k--){
                System.out.print(k + " ");
            }
            System.out.println();
*/

        int score = 3;
        if (score == 1) {
            System.out.println("1");
        } else if (score == 2) {
            System.out.println("2");
        } else {
            System.out.println("invalid");
        }

        switch (score) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("invalid");
                break;
        }
          /*
        Monday or Tuesday ==> java
        Thursday or Friday ==> Selenium
        Wednesday or Saturday ==> SQL
        otherwise day off
        (do not use if statement)

         */
        String day = "Sunday";

        switch (day) {
            case "Monday":
                System.out.println("java");
                break;

            case "Tuesday":
                System.out.println("Java");
                break;
            case "Wednesday":
                System.out.println("SQL");
                break;
            case "Thursday":
                System.out.println("Selenium");
                break;
            case "Friday":
                System.out.println("Selenium");
                break;
            case "Saturday":
                System.out.println("SQL");
                break;
            default:
                System.out.println("off day");

        }
    }
}