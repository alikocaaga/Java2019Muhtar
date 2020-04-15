package Calismalarim.GenelTekrar.OOP;

public class Constructors {

    int x;
    int y;

    Constructors(){ //default constructor
        x=10;
        y=20;
    }

    Constructors(int a, int b){ //parameterized constructor
        x=a;
        y=b;
    }

    void display(){
        System.out.println("(x+y) = " + (x + y));
    }


    public static void main(String[] args) {
        Constructors ccc = new Constructors(); //Invokes default contructor
        Constructors ddd = new Constructors(200,300); //Invokes default contructor
        ccc.display();
        ddd.display();

    }
}
