package Calismalarim;

public class MethodsPractices {

    public static void deneme1(String x, int a) {

        for (int i = 0; i < 5; i++) {
            System.out.println("I love " + x + "," + a);
        }
    }


    public static void main(String[] args) {

        deneme1("You", 5);
       double xx = uzunluk();
        System.out.println(xx);
    }

    public static double uzunluk (){
        double myDouble = 3.5;
        return myDouble;

    }

}
