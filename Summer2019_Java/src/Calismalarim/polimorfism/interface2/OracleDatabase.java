package Calismalarim.polimorfism.interface2;

public class OracleDatabase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Oracle Ekleme");

    }

    @Override
    public void delete() {
        System.out.println("Oracle silme");
    }

    @Override
    public void get() {
        System.out.println("Oracle elde etme");
    }

    @Override
    public void update() {
        System.out.println("Oracle guncelleme");
    }
}
