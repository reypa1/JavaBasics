package basic_java_programs;

import java.io.File;

public class File_hidden 
{
	public static void main(String[] args) 
	{
		File file=new File("E:\\study\\IT\\software engineering\\Testing\\Software testing material\\TESTING\\STLC");
		if(file.isHidden())
		{
    		System.out.println("The specified file is hidden");
    	}
		else
    	{
    		System.out.println("The specified file is not hidden");
    	}
	}
}
