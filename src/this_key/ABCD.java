package this_key;

public class ABCD 
{

	String name;
	int id;
	float salary;
	
	public ABCD(String name,int id,float salary)
	{
		System.out.println(this.name=name);
		System.out.println(this.id=id);
		System.out.println(this.salary=salary);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		ABCD a=new ABCD("Pavan Kumar", 12, 42000);
		
		

	}

}
