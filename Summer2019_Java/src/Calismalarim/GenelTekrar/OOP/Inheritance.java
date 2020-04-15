package Calismalarim.GenelTekrar.OOP;

class A { //Parent
    int a;

    void display() {
        System.out.println(a);
    }
}

class B extends A { //B is child class, A is parent class
    int b;

    void print() {
        System.out.println(b);
    }
}

public class Inheritance {
    // Inheritance : Aquiring all tje properties & behaviour
    public static void main(String[] args) {
        A aobj = new A();
        aobj.a = 100;
        aobj.display();



        B bobj = new B();
        bobj.a = 120;
        bobj.b = 200;
        bobj.display();
        bobj.print();
    }


}
