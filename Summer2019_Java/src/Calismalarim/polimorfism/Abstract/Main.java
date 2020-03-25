package Calismalarim.polimorfism.Abstract;



public class Main {

    public static void main(String[] args) {

        AbstractDatabase abstractDatabase = new Mongodatabase();
        AbstractDatabase abstractDatabase2 = new MysqlDatabase();

        abstractDatabase.update();
        abstractDatabase2.get();

    }

}
