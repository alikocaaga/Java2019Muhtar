package Calismalarim;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueValues {
    public static void main(String[] args) {
        int [] nums = new int[6];
        nums[0]= 44;
        nums[1]= 32;
        nums[2]= 100;
        nums[3]= 100;
        nums[4]= 100;
        nums[5]= 100;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        double [] sayi ={12.4,34.5,67.8,45.7};
        System.out.println(Arrays.toString(sayi));

        String [] names = {"Osman", "Veli", "Hadi"};
        System.out.println(Arrays.toString(names));

        String str = "aaaddddffffvvvvfffdddccccc";
        String unique = "";
        for (int i = 0; i < str.length();i++){
            if(!unique.contains(str.charAt(i)+"")){
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);

        }
    }

