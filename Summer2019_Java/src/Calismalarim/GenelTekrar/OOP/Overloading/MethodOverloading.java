package Calismalarim.GenelTekrar.OOP.Overloading;

public class MethodOverloading {

    void add (int a, int b){
        System.out.println("(a+b) = " + (a + b));

    }

    void add (double a, int b){
        System.out.println("(a+b) = " + (a + b));
    }
    void add (int a, float b){
        System.out.println("(a+b) = " + (a + b));
    }
    void add (double a, double b){
        System.out.println("(a+b) = " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading mm = new MethodOverloading();
        mm.add(2,3);
        mm.add(3,5.6f);
        mm.add(4.5,5.6);
        mm.add(4.3,4);
    }
}
