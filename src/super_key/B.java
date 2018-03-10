package super_key;

public class B extends A 
{
public void add()
{
	super.add();
	System.out.println("This is addition");
}

public void sub()
{
	super.add();
	System.out.println("This is substraction");
}

public void div()
{
	System.out.println("This is division");
}
	public static void main(String[] args)
	{
		B b=new B();
		b.add();
		b.sub();
		b.div();
		
     
	}

}
