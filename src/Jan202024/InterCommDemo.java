package Jan202024;
class ThreadDemo4 extends Thread
{
    int sum=0;
    public void run()
    {
        synchronized (this)
        {
            System.out.println("child thread start sum");
            for (int i = 0; i < 100; i++)
            {
                sum+=i;
            }
            System.out.println("Child thread giving notification");
            this.notify();
        }
    }
}

public class InterCommDemo
{
    public static void main(String[] args) throws InterruptedException
    {
     ThreadDemo4 t1=new ThreadDemo4();
     t1.start();
     synchronized (t1)
     {
         System.out.println("Main thread wating for t1");
         t1.wait();
         System.out.println("main thread get notification ");
         System.out.println(t1.sum);

     }

    }
}
