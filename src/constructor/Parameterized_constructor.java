package constructor;

class Parameterized_constructor 
{
	 int id;  
	 int age;
	 String str; 
	 
	public Parameterized_constructor(int id, String str, int age)
	{
	 this.id=id;
	 this.str=str;
	 this.age=age;
	}
	
	public void display()
	{
	System.out.println(id+ " " +str+ " " +age);
	}
	
	public static void main(String[] args) 
	{
		Parameterized_constructor p=new Parameterized_constructor(12, "pavan kumar", 25);
		
		p.display();
	}
}