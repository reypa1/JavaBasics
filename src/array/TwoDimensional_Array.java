package array;

public class TwoDimensional_Array 
{
	public static void main(String[] args) 
	{

		String s[][]=new String[3][4];
		
		s[0][0]="A1";
		s[0][1]="B1";
		s[0][2]="C1";
		s[0][3]="D1";
		
		s[1][0]="A2";
		s[1][1]="B2";
		s[1][2]="C2";
		s[1][3]="D2";
		
		s[2][0]="A3";
		s[2][1]="B3";
		s[2][2]="C3";
		s[2][3]="D3";
		
		System.out.println("Value of 1st row  2 col is : "+s[0][1]);
		System.out.println("Value of 3rd row  4 col is : "+s[2][3]);
		
		for(int row=0;row<s.length;row++)
		{
			for(int col=0;col<s[0].length;col++)
			{
				System.out.println(s[row][col]);
			}
		}
		
	}

}
