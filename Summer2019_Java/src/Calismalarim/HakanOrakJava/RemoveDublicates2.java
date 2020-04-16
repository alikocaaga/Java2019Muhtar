package Calismalarim.HakanOrakJava;

public class RemoveDublicates2 {
    public static void main(String[] args) {

        String str = "AAAAABBBBGGGHHHFFF";
        System.out.println(removeDup(str));
    }

    public static String removeDup(String str) {

        String result = "";

        while (str.length()>0){
            if(!result.contains(str.substring(0,1))){
                result += str.substring(0,1);
                str = str.replaceAll(str.substring(0,1),"");
            }
        }
        return result;
    }


}
