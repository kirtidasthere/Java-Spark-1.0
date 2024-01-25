package Jan112024;
import com.sun.media.sound.AiffFileReader;
public class ThrowsDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main");

        m1();
    }
    public static void m1() throws InterruptedException
    {
        System.out.println("m1");
        m2();
    }

    public static void m2() throws InterruptedException
    {
        System.out.println("m2");

        m3();

    }

    public static void m3() throws InterruptedException
    {
        System.out.println("m3");

        Thread.sleep(3000);
        System.out.println("mai hu m3");
        System.out.println("Kirtidas There");
    }
}
