// write a program to covert tempreture from Celsius to Fahrenheit using the formula.
public class TempretureConvert 
{

	public static void main (String args[])
		{ 
//		convert the celsius to fahernheit 
			int celsius = 34;
			int fahernheit = (celsius * 9/5) + 32;
			System.out.println("calcules to fahernheit tempreture: "+ fahernheit);

//			convert the fahernheit to celsius 
			int Fahernheit =5;
			int Celsius = (Fahernheit  -32) + 5/9;
			System.out.println("Fahernheit to celsius Tempreture: " + Celsius);
		
		}
}

/*output:
calcules to fahernheit tempreture: 93
Fahernheit to celsius Tempreture: -27

 */