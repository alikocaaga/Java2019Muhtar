package Calismalarim.MevlutBilim;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface ArrayOp<T,E>{
    T function(E e);

}
public class ArrayInterface {
    public static void main(String[] args) {
        int [] intArr = {6,7,89,0,89,98,121,34};
        String[] strArr = {"Ahmet","Mehmet", "Osman", "Ayse"};
        System.out.println(change.function(strArr));
        System.out.println(max.function(intArr));

    }
    public static ArrayOp<List<String>,String[]> change = str->{
        return Arrays.stream(str)
                .map(x->""+x.charAt(1)+x.charAt(0)+x.substring(2,x.length()))
                .collect(Collectors.toList());
    };
    public static ArrayOp<Integer,int [] > max = intarr -> {
        return Arrays.stream(intarr)
                .max()
                .getAsInt();
    };
}
