package Calismalarim.GenelTekrar.OOP;

public class StaticExamble {
    // static methods can access only static stuff (directly - without creating an object)
    // static methods can also access non static stuff but through object.
    // Non static methods can access both static & non static stuff direct.

    static int a = 10; //static varaible
    int b = 20;  // non static varaible

    static void m1() {//static method
        StaticExamble ss = new StaticExamble();
        System.out.println(ss.b);
        System.out.println("this is m1 - static method");
    }

    void m2() { //non static method

        System.out.println("this is m2 non static method");

    }

    void m3() {
        System.out.println("This is m3 method -- Non static");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {
        System.out.println(StaticExamble.a);
        //    StaticExamble.m1();
        //      System.out.println(b); incorrect because b is non static varaible
        //      m2(); incorrect, because m2() is non static method

        StaticExamble se = new StaticExamble();
        //     se.m2(); // non statuc method through object
        //      System.out.println(se.b); //non static varaible through object

        se.m3();


    }
}
