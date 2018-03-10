package constructor;

public class Constructor 
{
	static int id;
	static String name="pavan";
public Constructor()
{
	System.out.println("Hi muppa");
}

public void testA()
{
	System.out.println("dude");
}

public static void main(String[] args)
{
	Constructor sample=new Constructor();
	sample.testA();
	System.out.println(name+ " "+id);
}
}
