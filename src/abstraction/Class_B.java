package abstraction;

public class Class_B extends Class_A
{

	@Override
	public void loan() 
	{
		System.out.println("This is loan Method");		
	}
	
	public void carloan()
	{
		System.out.println("This is car loan method");
	}

	@Override
	public void credit() 
	{
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void debit() 
	{
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		Class_B b=new Class_B();
		b.carloan();
		b.credit();
		b.debit();
		b.loan();
	}
	

}
