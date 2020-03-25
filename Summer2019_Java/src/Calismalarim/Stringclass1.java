package Calismalarim;

public class Stringclass1 {
    public static void main(String[] args) {

        String str = "Bach12 is perfect class";

        int num = str.indexOf("as");
        System.out.println(num);

        String B1 = "Today is Tuesday, today we have class in the afternoon";
       int n1= B1.indexOf("ternoo");
        System.out.println(n1);

        String emailadress = "alikocaaga@gmail.com";

        int begin = emailadress.indexOf("@");
        int end = emailadress.indexOf(".com");
        String emailType = emailadress.substring(begin,end);

        System.out.println(emailType);

        int n2 = emailadress.lastIndexOf("o");
        System.out.println(n2);

        String str2 = "Cybertek";
        boolean R1 = str2.isEmpty();
        System.out.println(R1);

        if (str2.isEmpty()){
            System.out.println("bos");
        }else {
            System.out.println("bos degil");
        }

        System.out.println(str2.endsWith("k"));


    }
}
