package this_key;
public class ABC 
{
	String name;
	int id;
	float salary;
	
	public void abcd(String name,int id,float salary)
	{
		System.out.println(this.name=name);
		System.out.println(this.id=id);
		System.out.println(this.salary=salary);
	}
	
	public static void main(String[] args)
	{
		ABC a=new ABC();
		a.abcd("Pavan Kumar", 12, 42000);
	}
}
