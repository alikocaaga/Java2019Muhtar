package Calismalarim.polimorfism.Abstract;

public class Mongodatabase extends AbstractDatabase {
    @Override
    void update() {
        System.out.println("Mongo guncelledi");
    }

    @Override
    void get() {
        System.out.println("Mongo verileri aldi");
    }
}
