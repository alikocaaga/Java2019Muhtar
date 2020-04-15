package Calismalarim.GenelTekrar;

import static org.apache.commons.lang3.ArrayUtils.contains;

public class WarUpArray {
    public static void main(String[] args) {
// Write a Java program to sum values of an array.

        int myArray []= {4,3,3,1,2};
        System.out.println(contains(myArray,4));
        int sum = 0;

        for (int i : myArray){
            sum += i;
        }
        System.out.println(sum);

    }
}
