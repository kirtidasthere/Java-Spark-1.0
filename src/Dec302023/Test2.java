package Dec302023;

class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }

}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

public class Test2
{
    public static void main(String[] args) {
        Shape s1= new Shape();
        s1.draw();

        Circle c1 = new Circle();
        c1.draw();

        Rectangle r1=new Rectangle();
        r1.draw();

        Shape n1=new Circle();
        n1.draw();

        Shape n2=new Rectangle();
        n2.draw();

        // Circle circle=new Shape(); It is not possible


    }

}
