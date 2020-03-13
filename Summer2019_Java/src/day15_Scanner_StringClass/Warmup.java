package day15_Scanner_StringClass;

public class Warmup {
	/*
 write a java program that can convert numbers between 0 ~ 9
  to words, if the number is greater than 9 or less than zero,
   out put should be "Invalid".
	 */

	public static void main(String[] args) {
    	/*
	}
        int num = 6;
        String result = "";
        if (num >= 0 && num <= 9) {

            if (num == 9)
                result = "nine";
            else if (num == 8)
                result = "eight";
            else if (num == 7)
                result = "seven";
            else if (num == 6)
                result = "six";
            else if (num == 5)
                result = "five";
            else if (num == 4)
                result = "four";
            else if (num == 3)
                result = "three";
            else if (num == 2)
                result = "two";
            else if (num == 1)
                result = "one";
            else
                result = "Zero";
        } else {
            result = "Invalid";
        }


        System.out.println(result);

        int n = 4;

        String result2 = n == 9 ? "nine" : n == 8 ? "eight"
                : n == 7 ? "seven" : n == 6 ? "six"
                : n == 5 ? "five" : n == 4 ? "four"
                : n == 3 ? "three" : n == 2 ? "two"
                : n == 1 ? "one" : n == 0 ? "zero" : "Invalid";

        System.out.println(result2);
*/

		int numara = 11;
		String sonuc = "";
		if (numara >= 0 && numara <= 9) {

			if (numara == 9)
			sonuc = "Dokuz";
			else if (numara == 8)
				System.out.println("Sekiz");
			else if (numara == 7)
				System.out.println("Yedi");
			else if (numara == 6)
				System.out.println("Alti");
			else if (numara == 5)
				System.out.println("Bes");
			else if (numara == 4)
				System.out.println("Dort");
			else if (numara == 3)
				System.out.println("Uc");
			else if (numara == 2)
				System.out.println("Iki");
			else if (numara == 1)
				System.out.println("Bir");
			else {
				System.out.println("Sifir");
			}

		}else {
			System.out.println("Basarisiz");
		}

		int n = 8;
		String sonuc2 = (n ==9) ? "nine"
				:(n==8) ? "eight"
				:(n==7) ? "seven"
				:(n==6) ? "six"
				:(n==5) ? "five"
				:(n==4) ? "four"
				:(n==3) ? "three"
				:(n==2) ? "two"
				:(n==1) ? "one"
				:"Invalid";

		System.out.println(sonuc2);

	}
}
