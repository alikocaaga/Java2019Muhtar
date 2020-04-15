package Calismalarim.GenelTekrar;

public class StringsMethods {
    public static void main(String[] args) {
        String s = "WELCOME";
        String s2 = "To our program";

        System.out.println(s.concat(s2));
        System.out.println(s.trim());
        System.out.println(s.contains("ME"));
        System.out.println("s.charAt(2) = " + s.charAt(2));
        System.out.println("s.equals(\"WELCOME\") = " + s.equals("WELCOME"));
        System.out.println("s.equals(\"WELCOME \") = " + s.equals("WELCOME"));
        System.out.println("s.equalsIgnoreCase(\"Welcome\") = " + s.equalsIgnoreCase("Welcome"));
        System.out.println("s.replace(\"Hosgeldiniz\") = " + s.replace("WELCOME","Hosgeldiniz"));
        System.out.println("s.replace('E','A') = " + s.replace('E', 'A'));
        System.out.println(s.substring(1, 4));
    }
}
