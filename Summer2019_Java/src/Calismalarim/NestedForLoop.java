package Calismalarim;

public class NestedForLoop {
    public static void main(String[] args) {

        int[][] TwoDimen = {{12, 45, 67, 89}, {54, 76, 98, 43},{34,56,34,67}};

        for (int outer = 0;outer<3 ;outer++ ){
            for (int inner = 0 ; inner< 4;inner++){
                System.out.print(TwoDimen[outer][inner] +",");
            }
            System.out.println();
        }



    }
}
