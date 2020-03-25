package Calismalarim;

class Animal {
    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("hayvan konusuyor");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "otuyor");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "Havliyor");
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "Kisniyor");
    }
}

public class Main {

    public static void speaktry (Animal animal){
        animal.speak();
    }

    public static void main(String[] args) {
        Animal animal = new Animal(("Hayvan"));
        Bird bird = new Bird("Limon");
        Dog dog = new Dog("Karabas");
        Horse horse = new Horse("Sahbatur");
/*
        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();


 */
/*
Animal animal2 = new Bird("Limomn");
animal2.speak();

 */
speaktry(new Horse("Sahbatur"));
    }

}
