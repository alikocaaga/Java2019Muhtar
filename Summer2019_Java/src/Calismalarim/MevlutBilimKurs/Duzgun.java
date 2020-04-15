package Calismalarim.MevlutBilimKurs;

public class Duzgun {
    static class Fruit {
        public String name;
        private String color;
        private int price;
        public Fruit(String color, int price) {
            this.name = "fruit";
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "I'm an %s and I am the color %s and I cost $%s dollars."+ name+" "+color+" "+price;
        }

        public void setName(String name) {
            this.name=name;
        }
    }
    static class Orange extends Fruit {
        public Orange(String name) {
            super("orange", 3);
        }

    }
    static class Apple extends Fruit {

        public Apple(String name) {
            super("red", 2);
        }

    }
    static class HoneyCrispApple extends Apple {
        private boolean isMultiColored = true;
        public HoneyCrispApple(String name) {

            super("MultiColored");
            setName(name);
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static class FruitStand {
        public static void main(String[] args) {
            Fruit banana = new Fruit("yellow", 1);
            banana.setName("Banana");
            System.out.println(banana);
            System.out.println(new Orange("Orange"));
            System.out.println(new Orange("Navel Orange"));
            System.out.println(new Apple("Red Delicious"));
            System.out.println(new HoneyCrispApple("Honey Crisp Apple"));
            Apple apple = new HoneyCrispApple("");
            apple.setName("Honey Crisp Apple");
            System.out.println(apple);
        }
    }
}
