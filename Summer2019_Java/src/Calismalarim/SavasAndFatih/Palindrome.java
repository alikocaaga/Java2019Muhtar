package Calismalarim.SavasAndFatih;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(IsPalindrome("ali"));

    }

    public static boolean IsPalindrome(String str) {
        if (str == null)
            return false;
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString().equals(str);

        }
    }


