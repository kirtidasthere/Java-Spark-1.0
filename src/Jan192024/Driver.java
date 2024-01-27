package Jan192024;

class ThreadDemo1 extends Thread
{
    public void run()
    {/*
        for (int i = 0; i <10 ; i++)
        {
            System.out.println("Kirtidas...");

        }
        */
    }
}


public class Driver
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());

        ThreadDemo1 t1=new ThreadDemo1();
        System.out.println(t1.getName());

        Thread.currentThread().setName("Kirtidas...");
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());

        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
    }
}
