package Calismalarim.polimorfism.interface2;

public class MongoDatabase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Mongo Ekleme");

    }

    @Override
    public void delete() {
        System.out.println("Mongo silme");
    }

    @Override
    public void get() {
        System.out.println("Mongo elde etme");
    }

    @Override
    public void update() {
        System.out.println("Mongo guncelleme");
    }
}
