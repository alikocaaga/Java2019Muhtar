package Calismalarim;

public class Scanner {


    public static void main(String[] args) {

        int num = 50;

        //  if (true) {
        //    num = 100;
        // } else {
        //    num = 50;


        int x = (false) ? 100 : 50;
        int y = false ? 100 : 50;

        System.out.println(x);
        System.out.println(y);


        String Schoolname = "";
        boolean Batch12 = true;

        if (Batch12) {
            Schoolname = "Cybertek";
        } else {
            Schoolname = "Invalid";
        }
//return olmasi icin sout icine yazilmasi sart
        System.out.println(Batch12 ? "Cybertek" : "Invalid");

        String BestSchool = Batch12 ? "Cybertek" : "Invalid";
        System.out.println(BestSchool);

        byte grade = 60;
        boolean Passed = grade >= 60 ? true : false;








    }
}

