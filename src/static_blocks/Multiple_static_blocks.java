package static_blocks;

public class Multiple_static_blocks 
{

	static int num;
	static String name;
	static
	{
		num=10;
	}
	
	static
	{
		num=20;
		//name="pavan";
	}
	
	public static void main(String[] args) 
	{
		
    //System.out.println(num);
    //System.out.println(name);
    System.out.println(num);
	}

}
