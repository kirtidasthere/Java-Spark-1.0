package Dec302023;

 class Gadi
{
        Gadi manfacture ()
        {
            System.out.println("Gadi lelo");
            return new Gadi();
        }

}
class ford extends Gadi
{
    ford manufacture()
    {
        System.out.println("Ford ki Gadi");
        return new ford();
    }

}

class A
{
    public static void main(String[] args)
    {
        Gadi a=new Gadi();
        a.manfacture();

        ford b=new ford();
        b.manufacture();
    }
}
