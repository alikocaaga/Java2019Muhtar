package Calismalarim.GenelTekrar.OOP.Interface;


interface ali{
    int a = 10;
    void m1 ();
}
/**
 * An interface in java is a blueprint of a class.
 * Interface contains final and static variables.
 * Interface contains abstact methods.
 * An abstract method is a method contains definition but not body.
 * Methods in interface are public by default
 * Interface supports the functionality of multiple inheritance.
 * We can define interface with interface keyword.
 * A class extends another class, an interface extends another interface but a class iplements am interace.
 * We can create object reference for Interface but we cannot instantiate interface.
 */
public class InterTest implements ali{
    public void m1(){
        System.out.println(a);
    }

    /**
     * public
     * default
     * protected
     * private
     */
    public static void main(String[] args) {
       InterTest it = new InterTest();
       it.m1();

       ali al = new InterTest();
       al.m1();

    }
}
