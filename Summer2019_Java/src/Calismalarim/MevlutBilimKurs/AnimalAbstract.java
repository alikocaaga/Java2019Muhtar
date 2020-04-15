package Calismalarim.MevlutBilimKurs;

/*
create an Animal abstract class
			data/attributes: gender, age, color, name
			create one constructor that can set the gender, name, color and age
			Actions: Speak(), Eat(), Sleep(), Drink();
		create sub classes of the Animal and override those actions:
					dog: Speak()	==> woof
						 Sleep()	==> 8 hours
						 Eat()		==> KFC
						 Drinks()	==> Milk Shake
					Cat: Speak()	==> meow
						 Sleep()	==> 14 hours
						 Eat()		==> m&m
						 Drinks()	==> Hot chocolate
					cow: Speak()	==> moo
						 Sleep()	==> 5 hours
						 Eat()		==> grace
						 Drinks()	==> Coffee with sugar
		create  zoo class and store some of those animals' objects
*/
abstract class Animals{
    String gender;
    int age;
    String color;
    String name;
    public Animals(String gender,int age,String color,String name) {
        this.gender=gender;
        this.age=age;
        this.color=color;
        this.name=name;

    }

    public abstract void Speak(String language);

    public abstract void Eat(String meal);


    public abstract void Sleep(int hours);

    public abstract void Drink(String drinks);
    public void getInfo() {
        System.out.println("Nick Name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender :"+gender);
        System.out.println("Color  : "+color);
    }
}

class Dog extends Animals{

    public Dog(String gender, int age, String color, String name) {
        super(gender, age, color, name);

    }
    @Override
    public void Speak(String language){
        System.out.println(name +" is speaking"+language);
    }

    @Override
    public void Sleep(int hours) {
        System.out.println(name+"is sleeping "+hours+" hours");

    }
    @Override
    public void Eat(String meal) {
        System.out.println(name+ "is eating.."+meal);
    }
    @Override
    public void Drink(String drinks) {
        System.out.println(name+" is drinking "+ drinks);

    }



}
public class AnimalAbstract {
    public static void main(String[] args) {
        Animals dog=new Dog("Male", 4, "green", "Husky");

        dog.getInfo();
    }

}