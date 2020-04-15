package Calismalarim.MevlutBilimKurs;
/*
create an interface called Cars              Actions: start()
create an interface called ElectricVehicles  Actions: Charge() SelfDrive()
create an interface called GasVehicles       Actions: PumpGas()
create classes:1. Tesla_Model3:implement Cars and  ElectricVehicles Interfaces
               2. Jeep_wrangler:implement Cars and GasVehicles Interfaces
               3. ToyotaHybird:implement Cars, GasVehicles, and  ElectricVehicles Interfaces

*/

interface Cars{
    void start ();
}
interface ElectricVehicle{
    void Charge();
    void SelfDrive();
}
interface GasVehicle{
    void PumpGas();
}
class Tesla_3 implements ElectricVehicle, Cars {

    @Override
    public void start() {
        System.out.println("Tesla_3 Push Button");
    }

    @Override
    public void Charge() {
        System.out.println("Tesla_3 Charging...");
    }

    @Override
    public void SelfDrive() {
        System.out.println("Tesla_3 Self Driving started");
    }
}
class Jeep_Wrangler implements Cars, GasVehicle{

    @Override
    public void start() {
        System.out.println("Jeep_Wrangler Push to Pedal");

    }
    @Override
    public void PumpGas() {
        System.out.println("Jeep_Wrangler Gas Pamping..");
    }
}
class Toyota_Hybrid implements Cars,ElectricVehicle, GasVehicle{

    @Override
    public void start() {
        System.out.println("Prius starting");
    }

    @Override
    public void Charge() {
        System.out.println("Prius Starting");
    }

    @Override
    public void SelfDrive() {
        System.out.println("Prius is self driving");

    }

    @Override
    public void PumpGas() {
        System.out.println("Prius Punping");

    }
}
public class CarInterface {
    public static void main(String[] args) {

        Cars tesla = new Tesla_3();
        Cars wrangler = new Jeep_Wrangler();
        Cars prius = new Toyota_Hybrid();

        tesla.start();
        wrangler.start();
        prius.start();
    }

}
