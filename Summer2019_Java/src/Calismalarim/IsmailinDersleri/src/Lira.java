package Calismalarim.IsmailinDersleri.src;

interface Lira{
    double tl = 0.2; // 1 TL = 0.2 USD
    void withDrawLira(double amount);
}
interface Rupee{
    double rupee = 0.1;
    void withDrawRupee(double amount);
}
interface Euro{
    double eu = 1.5;
    void withDrawEuro(double amount);
}
 class BankAccount implements Euro,Rupee,Lira {
    double myDollar = 100;
    double myLira = myDollar / tl;
    double myRupee = myDollar / rupee;
    double myEuro = myDollar / eu;

    @Override
    public void withDrawLira(double amount) {
        myDollar -= amount * tl;
        myLira = myDollar / tl;
        System.out.println("my lira is  : " + myLira);
        System.out.println("my dollar is :  " + myDollar);

    }
    @Override
    public void withDrawRupee(double amount) {

    }
    @Override
    public void withDrawEuro(double amount) {
        myDollar -= amount * eu;
        myEuro = myDollar / eu;
        System.out.println(myEuro);
//		myDollar -= withdraw * euro;
//		myEuro = myDollar / euro;
//		return myEuro;
    }

}

