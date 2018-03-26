package interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements_InList {

	public static void main(String[] args) 
	{
	List<Integer>list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	System.out.println("Elements before swapping is : "+list);
	
	Collections.swap(list, 1, 3);
	
	System.out.println("Elements After swapping is  : "+list);

	}

}
