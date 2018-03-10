package interface_Car;

public class Class_B implements Class_A
{
	@Override
	public void start() 
	{
		System.out.println("This is start method");	
	}

	@Override
	public void stop() 
	{
		System.out.println("This is stop method");	
	}

	@Override
	public void accelerate() 
	{
		System.out.println("This is accelerate method");	
	}

	@Override
	public void Break() 
	{
		System.out.println("This is break method");
	}
	
	public void refuel()
	{
	System.out.println("This is non-abstract refuel method");	
	}
	
	public static void main(String[] args) 
	{
		Class_B b=new Class_B();
		b.accelerate();
		b.Break();
		b.start();
		b.stop();
		b.refuel();
		
		Class_A a=new Class_B();
		a.accelerate();
		a.Break();
		a.start();
		a.stop();
	}

}
