package Calismalarim.IsmailinDersleri.src;

import Calismalarim.IsmailinDersleri.src.EncapsulationExample;
import Calismalarim.IsmailinDersleri.src.Kid;

public class Main {

    public static <Kid, Circle1> void main(String[] args) {
       EncapsulationExample obj1 = new EncapsulationExample();
        obj1.age = 10;
        obj1.setIdNum("12345");
        obj1.setName("Ahmet");
        // Your name, id number, age.
        System.out.println("Age : " + obj1.age);
        System.out.println("ID Number : " + obj1.getIdNum());
        System.out.println("Name : " + obj1.getName());
    }


/*
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();



        Kid ahmet = new Kid();
        System.out.println(ahmet.momEyes);
        System.out.println(ahmet.dadHeight1);
        System.out.println(ahmet.name);
        System.out.println(ahmet.mom());

     */


    }


/*
        final int d=10;

        BankAccount ahmet1 = new BankAccount();
        ahmet1.withDrawLira(90);


        Circle1 s3=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s3.draw();
        s3.shapeMethod();

*/



