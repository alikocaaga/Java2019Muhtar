package Calismalarim;

public class ForLoop5_Dublicate_Delete {
    public static void main(String[] args) {

        String src = "dsgaeraerdgaefafsfsdwfSEFADSDFAWFEGDSG";

        String result = "";
        for (int i = 0; i < src.length(); i++) {
            if (!result.contains(src.substring(i, i + 1))) {
                ;
                result += src.substring(i, i + 1);
            }

        }
        System.out.println(result);
    }
}