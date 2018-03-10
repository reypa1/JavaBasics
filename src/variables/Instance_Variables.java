package variables;

public class Instance_Variables {

	/*Instance variable : When a variable is created inside the class and outside the method,
	 * then it is known as instance variable or class variable or global variable.
	 * Whenever instance variable is created it will store in heap memory.
	 * To access the instance variable we need to create an object to call the variable.
	 */
	int age=26;
	double salary=450000;
	
	public void emplyee()
	{
		Instance_Variables emp=new Instance_Variables();
		System.out.println("My age is : " +emp.age);
		System.out.println("My salary is : " +emp.salary);
		
		
	}
}
