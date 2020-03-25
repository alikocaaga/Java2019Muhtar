package Calismalarim;

public class ForLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 20 ; i+=2)
            System.out.println("square is of "+i + " is = > "+ (i*i));



        for(int i=1;i<=20;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }

    }

        String a = "123456789";


        String rev = "";
        for( int i = a.length()-1; i >=0 ; i--){
            rev += a.charAt(i);
        }
        System.out.println(rev);
    }


}
