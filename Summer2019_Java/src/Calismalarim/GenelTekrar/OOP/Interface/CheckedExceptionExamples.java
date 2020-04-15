package Calismalarim.GenelTekrar.OOP.Interface;

public class CheckedExceptionExamples {
    public static void main(String[] args) {

        System.out.println("Started");
String x = null;
int b=100;

        try {
            System.out.println(x.length());
            System.out.println(b/0);

        } catch (Exception e) {
        e.printStackTrace();
        }

        System.out.println("Ended");
    }
}
