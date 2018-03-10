package super_key;

public class Child extends Parent 
{
	int speed=120;
	String name="Kumar";
	
	public void B()
	{
		System.out.println(super.name);
		System.out.println(name);
		
		System.out.println("Normal speed is : "+super.speed);
		System.out.println("Max speed is : "+speed);
		
		System.out.println("This is child class");
	}
	
	public static void main(String[] args)
	{
		Child c=new Child();
		//c.A();
		c.B();
	}
}
