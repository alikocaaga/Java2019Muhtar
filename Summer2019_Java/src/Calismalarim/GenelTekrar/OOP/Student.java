package Calismalarim.GenelTekrar.OOP;

public class Student {

    int sId ;
    String sName;
    char grade;
    Student (int id, String name, char g){ //constructor
        sId=id;
        sName=name;
        grade=g;
    }

    void getValues(int id, String name, char g ){ //method
        sId=id;
        sName=name;
        grade=g;
    }

    void display(){
        System.out.println(sId+" "+sName+" "+grade);
    }
/**
 * Constructor
 * 1. Constructor a special type of method
 * 2. Constructor used for initiliazin the class varaibles
 * 3. Constructor name should be same as class name
 * 4. Constructor will not return any value (not even void)
 * 5. Constructor will be invoked at the time of object creation.
 *
 */
}

