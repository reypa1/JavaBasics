package this_key;

public class B extends A 
{
	float salary;
	
	public B(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
	public void abc()
	{
	System.out.println(name+" "+id+" "+salary);	
	}
	
	public static void main(String[] args) 
	{
     B b=new B(12,"Pavan",42000f);
     b.abc();
	}

}
