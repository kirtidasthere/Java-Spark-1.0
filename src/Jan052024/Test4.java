package Jan052024;

class Animal
{
    String name;
}
class Dog extends Animal
{
    String name;

    void print()
    {
        super.name="Animal";
        name="jypsy";
        System.out.println("Parent name = "+super.name + ", child name = "+this.name);
    }
}
public class Test4
{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.print();
    }

}
