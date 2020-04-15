package Calismalarim.GenelTekrar.OOP;

public class Methods {

    int x = 10;
    int y = 20;

    /*  void sum(){
          System.out.println(x+y); // Case 1 - not taking parameters and also not returned any value
      }


      int sum (){ //Case 2 = not taking parameters but returning value
          return (x+y);
      }
     */
    //  void sum(int a, int b) { //Case 3 - taking parameters, but not returning any value
    //    System.out.println(a + b);
    int sum(int a, int b) {//Case 4 - method is taking parameters and also returning a value
        return (a + b);
    }


    public static void main(String[] args) {
        Methods cal = new Methods();
        // cal.sum(); //case 1

        //  int res = cal.sum(); //case 2
        //  System.out.println(res);
        //  System.out.println(cal.sum());

        //   cal.sum(34, 56); //case 3

        System.out.println(cal.sum(34, 56));
    }
}
/*
Method --> Block of code

1. Case 1 - not taking parameters and also not returned any value
2. Case 2 = not taking parameters but returning value
3. Case 3 - taking parameters, but not returning any value
4. Case 4 - method is taking parameters and also returning a value
 */