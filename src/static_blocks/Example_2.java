package static_blocks;

public class Example_2 
{
    static int num;
	static void mymethod()
	{
		Example_2 ex=new Example_2();
		System.out.println(ex);
		
		num=10;
		num=30;
		System.out.println("Hi");
	}
	public static void main(String[] args) 
	{
		mymethod();
		System.out.println(num);
	}

}
