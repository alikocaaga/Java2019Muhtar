package Calismalarim.GenelTekrar.OOP;

public class Exceptions {
    public static void main(String[] args) {

        System.out.println("Started");
        System.out.println("lenghth");
        try {


            String ab = null;
            System.out.println(ab.length());
        } catch (NullPointerException e) {

        }
        int a = 100;
        int res=0;
        try {


       //     System.out.println((a / 0));
            res=a/0;
        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException hata var");

        }
        System.out.println(res);
    }

}