package Calismalarim.GenelTekrar.OOP;

public class StudentMain {
    public static void main(String[] args) {

        Student stu1 = new Student(1200, "Nail",'C');
    /*  First Method asign values by using reference varaible
      stu1.sId=1010;
        stu1.sName="Ahmet";
        stu1.grade='A';
     */
    // Second Method : assign values by using method
   // stu1.getValues(1100,"Osman",'B');
        stu1.display();

    }
}
