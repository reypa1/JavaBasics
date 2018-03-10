package interview_questions;

import java.util.StringTokenizer;

public class How2Remove_mul_spaces_in_string 
{
	public static void main(String[] args) 
	{
		String input = "Try    to    remove   extra   spaces.";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        while(substr.hasMoreElements())
        {
            sb.append(substr.nextElement()).append(" ");
        }
        System.out.println("Actual string : "+input);
        System.out.println("Processed string : " + sb.toString().trim());
	}
}
