package Calismalarim.GenelTekrar.OOP.Overloading;

public class ContructorOverloading {

    ContructorOverloading(int a, int b){
        System.out.println("(a+b) = " + (a + b));
    }
    ContructorOverloading(double a, int b){
        System.out.println("(a+b) = " + (a + b));
    }
    ContructorOverloading(int a, double b){
        System.out.println("(a+b) = " + (a + b));
    }
    ContructorOverloading(double a, double b,double c){
        System.out.println("(a+b+c) = " + (a + b +c));
    }

    public static void main(String[] args) {
        ContructorOverloading co1 = new ContructorOverloading(23,56);
        ContructorOverloading co2 = new ContructorOverloading(23.5,56);
        ContructorOverloading co3 = new ContructorOverloading(23,56.5);
        ContructorOverloading co4 = new ContructorOverloading(23.2,56.8,23.5);
    }
}
