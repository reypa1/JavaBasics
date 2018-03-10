package constructor;

public class Sample_test 
{
	static int id =12;  
	static String name="pavan";
	public void testA()
	{
		System.out.println("hi dude");
	}
	
	public static void main(String[] args)
	{
		Sample_test sample=new Sample_test();
		sample.testA();
		System.out.println(name+ " " +id);
	}
}
