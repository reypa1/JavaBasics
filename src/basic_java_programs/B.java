package basic_java_programs;

public class B extends A
{

public void m2()
{
	System.out.println("This is B class");
}

public void m3()
{
	System.out.println("This is B sub class");
}
	
	public static void main(String[] args) 
	{
	A a=new B();
	a.m1();
	m4();
	
	B b=new B();
	b.m2();
	b.m3();

    
	}

}
