package Jan072024;

interface vehicleInterface
{
    public int CalculateSpeed(); //public abstract
    int a=10; //public static final
}

class Truck implements vehicleInterface
{
    public int CalculateSpeed()
    {
        return 80;
    }
}

class Bus implements vehicleInterface
{
    public int CalculateSpeed()
    {
        return 90;
    }
}

class sportBike implements vehicleInterface
{
    public int CalculateSpeed()
    {
        return 220;
    }



}
public class VehicleInterfaceDemo
{
    public static void main(String[] args) {
        vehicleInterface sb=new sportBike();
        System.out.println("Speed of sport bike = "+sb.CalculateSpeed());

        vehicleInterface t=new Truck();
        System.out.println("Speed of Truck = "+t.CalculateSpeed());

        vehicleInterface b=new Bus();
        System.out.println("Speed of Bus = "+b.CalculateSpeed());

    }
}
