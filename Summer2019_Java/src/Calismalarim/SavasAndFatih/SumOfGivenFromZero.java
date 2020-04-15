package Calismalarim.SavasAndFatih;

public class SumOfGivenFromZero {
    public static void main(String[] args) {

        System.out.println("ikiye bolunmeyenlerin toplami = "+ Osman(6));
        System.out.println("Ikiye bolunebilenlerin toplami  = " +Sum2(7));
    }

    public static int Osman(int hasan) {

        int sum = 0;

        for (var i = 1; i <= hasan; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int Sum2(int deger) {


        int toplam = 0;

        for (var i = 1; i <= deger; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }

        }
        return toplam;
    }
}