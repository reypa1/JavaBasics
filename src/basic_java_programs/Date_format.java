package basic_java_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_format 
{
	public static void main(String[] args) 
	{	
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/YYYY");
		//Print numerically
		System.out.println(sdf.format(d));
		//Print in Alphabets
		System.out.println(d.toString());
	}
}
