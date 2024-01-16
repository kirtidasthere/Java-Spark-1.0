package Dec302023;

 class Jungle
{
   protected void makeNoise() //public
    {
        System.out.println("Jungle Sound");
    }
}

class Cat extends Jungle
{
   public void makeNoise()
    {
        System.out.println("meow");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Cat cat=new Cat();
        System.out.print("child object => ");
        cat.makeNoise();

        Jungle jungle=new Jungle();
        System.out.print("Parent object => ");
        jungle.makeNoise();

        Jungle parent = new Cat();
        parent.makeNoise();

    }
}
