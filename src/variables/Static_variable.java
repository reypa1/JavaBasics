package variables;

public class Static_variable {

	/*static variable: static variable is created with a static keyword.
	 * It is created out side of method and inside the class.
	 * static variables are having the common memory for all the objects.
	 * static variables are stored in a method memory area.
	 * For static variable no need to create a object, we can call directly by using classname.
	 */
	static int age=26;
	static double salary = 45000;
	
	public void emplyee(){
		
		System.out.println("My age is : " +Static_variable.age);
		System.out.println("My salary is :" +Static_variable.salary);
		}
}
