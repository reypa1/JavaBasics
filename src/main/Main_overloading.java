package main;
public class Main_overloading 
{
	 public static void main(int a) 
	 {
	        System.out.println(a);
	 }
	 
	public static void main(String arg1) 
	{
	    System.out.println("Hi, " + arg1);
	    Main_overloading.main("Dear Geek","My Geek");
	}
	
	public static void main(String arg1, String arg2) 
	{
	    System.out.println("Hi, " + arg1 + ", " + arg2);
	}
	
	public static void main(String[] args) 
	{
		 System.out.println("Hi Geek (from main)");
		 Main_overloading.main("Geek");
		 main(100);
	}
}
