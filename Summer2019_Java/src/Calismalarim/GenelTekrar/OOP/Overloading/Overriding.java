package Calismalarim.GenelTekrar.OOP.Overloading;

class Bank {
    double reteOfInterest(){
        return 0;
    }
}

class WelsFargo extends Bank{
    double reteOfInterest(){
        return 10.5;
    }
}
class BankOfAmerika extends Bank{
    double reteOfInterest(){
        return 12.4;
    }
}
class Region extends Bank{
    double reteOfInterest(){
        return 9.5;
    }
}

public class Overriding {
    public static void main(String[] args) {


        WelsFargo wf = new WelsFargo();
        System.out.println(wf.reteOfInterest());
        BankOfAmerika boa = new BankOfAmerika();
        System.out.println(boa.reteOfInterest());
        Region rg = new Region();
        System.out.println(rg.reteOfInterest());

    }
}
