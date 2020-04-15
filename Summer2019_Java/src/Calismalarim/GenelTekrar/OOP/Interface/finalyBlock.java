package Calismalarim.GenelTekrar.OOP.Interface;

public class finalyBlock {
    public static void main(String[] args) {

        System.out.println("Started");

        int a = 100;

        try {
            System.out.println(a/0);
        }catch (NullPointerException e){
            System.out.println("Aritmatic");
        }finally {
            System.out.println("Finaly");
        }



        System.out.println("ended");
    }
}
