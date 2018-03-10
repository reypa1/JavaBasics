package inheritance;
public class ClassC extends ClassB
{
public void sample_testC()
	{
		System.out.println("Kumar");
	}
	
	public static void main(String[] args) 
	{
		ClassC c=new ClassC();
		c.sample_testA();
		c.sample_testB();
		c.sample_testC();
	}
}
