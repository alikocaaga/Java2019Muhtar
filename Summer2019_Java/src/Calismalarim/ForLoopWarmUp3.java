package Calismalarim;

public class ForLoopWarmUp3 {
    public static void main(String[] args) {

        int sum =0;
        for (int i = 1; i<=1000 ; i++){
            sum += i;

        }
        System.out.println(sum);

        int sum2 =0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0){
                sum2 += i;
            }
        }
        System.out.println(sum2);

        int sum3 =0;
        for (int i=1; i <=1000; i++){
            if (i % 2 ==1){
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }
}
