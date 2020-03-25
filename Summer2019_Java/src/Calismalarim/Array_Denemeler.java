package Calismalarim;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Denemeler {
    public static void main(String[] args) {

        int myArray[] = new int[6];

        myArray[0] = 7;
        myArray[1] = 45;
        myArray[2] = 23;
        myArray[3] = 12;
        myArray[4] = 67;
        myArray[5] = 34;

        for (int k = 0; k <= myArray.length; k++) {

            System.out.println("My Array is = " + k + "---> " + myArray[k]);


            int numbers[] = {12, 45, 78, 45, 23, 12, 67, 89};
            for (int i = 0; i <= numbers.length; i++) {
                //     System.out.println(YourArray[i]);
            }
            Arrays.sort(numbers);

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

    }
}