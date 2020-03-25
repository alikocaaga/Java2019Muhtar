package Calismalarim.IsmailinDersleri.src;

class Kid implements Mom,Dad{
    String name = "Ahmet";

    public String mom(){
        return "Mommy loves you";
    }

     public String dad() {
         return "dad love you";
     }
}
