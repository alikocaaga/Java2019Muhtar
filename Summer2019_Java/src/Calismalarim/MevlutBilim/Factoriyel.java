package Calismalarim.MevlutBilim;

import java.util.stream.IntStream;


public class Factoriyel {


    public static void main(String[] args) {
     var factoriyel =1;
     for( var i = 1; i <=5 ; i++){
         factoriyel *= i; // factoriyel = factoriyel * i;
        }
        System.out.println(factoriyel);

     var n = 6;

     var f = IntStream.rangeClosed (1,n)
             .reduce(1,(x,y)->x*y);

        System.out.println(f);
    }
}
