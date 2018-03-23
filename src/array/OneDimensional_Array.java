package array;

public class OneDimensional_Array 
{
public static void main(String[] args) 
{
	
	//Disadvantages of 1 dimentional array is 
	//Size is fixed
	//It will store only similar data types
	
	int a[]={1,2,3,4,5,6,7,8,9,10};
	System.out.println(a[1]);
	
	//Fix the size of an array and create values
    int i[]=new int[3];
        i[0]=10;
        i[1]=20;
        i[2]=30;
    
    System.out.println("Lenght of an array is : "+i.length);
    System.out.println(i[1]);
    
    // To print all the values in an array use for loop
    for(int j=0; j<i.length;j++)
    {
    	System.out.println(i[j]);
    }
    
	//object is a class and it is used to store different data type values
    Object obj[]=new Object[5];
    obj[0]="Pavan";
    obj[1]=12;
    obj[2]=0.137;
    obj[3]="M";
    obj[4]=0.12;
    
    System.out.println("Lenght of an object is : "+obj.length);
    
    //To print all the values use for loop
    for(int k=0;k<obj.length;k++)
    {
    	System.out.println(obj[k]);
    }
    }
}
