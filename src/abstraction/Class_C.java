package abstraction;

public class Class_C {

	static public void main(String[] args) 
	{
		Class_B b=new Class_B();
		b.debit();
		b.credit();
		b.carloan();
		b.loan();
		
		Class_A a=new Class_B();
		a.loan();
		a.credit();
		a.debit();
		

	}

}
