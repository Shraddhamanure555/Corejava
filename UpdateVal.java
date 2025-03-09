/*Write a java program to take an integer and update it step by step using assignment 
operators(==,+=,-=,*=,/=,%=) and display the intermediate result*/
public class UpdateVal
{

	public static void main(String args[])
	{
			int a = 88;
			System.out.println("oringial value of a: "+ a);
		//	+=
			a += 7;
			System.out.println("PLUS equal to: "+a);
		//  -=
			a-=5;
			System.out.println("substract equal to: "+ a);
		//  *=
			a*=2;
			System.out.println("multiply equal to: "+ a);
		//.../=
			a/=3;
			System.out.println("Division equal to: " + a);
		//  %=
			a%=2;
			System.out.println("Modulus equal to: "+ a);
			
		
		
	}
}
/* 
Output: oringial value of a: 88
 PLUS equal to: 95
 substract equal to: 90
 multiply equal to: 180
 Division equal to: 60
 Modulus equal to: 0
 */

