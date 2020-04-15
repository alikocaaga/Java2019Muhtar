package Calismalarim.GenelTekrar.OOP.Overloading;

public class ovlerloadMainMethod {
    public static void main(String[] args) {
        ovlerloadMainMethod ooo = new ovlerloadMainMethod();
        ooo.main(23.4,12);
        ooo.main(23,45);

    }
    public void main (int a, int b){
        System.out.println(a+b);
    }


    public void main (double a, int b){
        System.out.println("(a*b) = " + (a * b));

    }
}
