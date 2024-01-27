package Jan192024;

/* class Demo extends Thread{
    public void run()
    {
        for (int i=0;i<10;i++)  //Thread Job
        {
            System.out.println("Jai Shree Ram...");

        }
    }
}
*/
class Demo implements Runnable
{
    public void run()
    {
        for (int i = 0; i <10 ; i++)
        {
            System.out.println("Jai shree ram");

        }
    }
}
public class ThreadDemo
{
    public static void main(String[] args)
    {
        /*Demo d= new Demo();
        d.start();
*/



        Demo d= new Demo();
        Thread t1=new Thread(d);
        t1.start();

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main...");

        }

    }
}
