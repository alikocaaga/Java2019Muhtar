package Calismalarim.IsmailinDersleri.src;

abstract class Shape2 {


        public void shapeMethod(){
            System.out.println("Hello From Shape Mehtod");
        }
        abstract void draw();
    }

class Rectangle2 extends Shape2{
    void draw(){System.out.println("drawing rectangle");}
}

class Circle1 extends Shape2{
    void draw()
    {System.out.println("drawing circle");}

    public void shapeMethod(){
        System.out.println("Hello From circle  Mehtod");
    }
}
//In real scenario, method is called by programmer or user



