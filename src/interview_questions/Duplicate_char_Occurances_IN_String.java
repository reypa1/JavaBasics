package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_char_Occurances_IN_String 
{
	public static void main(String[] args) 
	{
		String s = "pavan&kumar";
		List<String> original = Arrays.stream(s.split("")).collect(Collectors.toList());
		List<String> duplicateRemoved = Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
		ArrayList<Integer> Occurrences = new ArrayList<>();
		int count = 1;
		for (String aList : duplicateRemoved) 
		{
		    count = (int) original.stream().filter(s1 -> s1.equals(aList)).count();
		            Occurrences.add(count);
		        }
		System.out.println(duplicateRemoved);
		System.out.println(Occurrences);
	}
}
