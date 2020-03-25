package Calismalarim.polimorfism.Abstract;

public class MysqlDatabase extends AbstractDatabase {
    @Override
    void update() {
        System.out.println("Mysql guncelledi");
    }

    @Override
    void get() {
        System.out.println("Mysql verileri aldi");
    }
}
