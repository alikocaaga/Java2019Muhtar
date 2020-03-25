package Calismalarim.polimorfism.Abstract;

public abstract class AbstractDatabase {
    public void add(){
        System.out.println("eklendi");
    }
    public void delete(){
        System.out.println("silindi");
    }

    abstract void update();
    abstract void get();

}
