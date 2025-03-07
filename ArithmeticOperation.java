import java.util.Scanner;

//Write the java program to a add, subtract , multiply, and divide two numbers entered by the user 

public class ArithmeticOperation {

	public static void main(String args[]) {
//		Here take the user input by Scanner class 
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Enter the number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number: ");
		int num2 = sc.nextInt();
		
		int addition = num1 + num2;
		int substrct = num1 - num2;
		int multiply = num1 * num2;
		int square = num1*num1;
		int division = num1/num2;
		
//		performing the operation 
		
		System.out.println("Addition: " + addition);
		System.out.println("Subtract: " + substrct ); 
				// when we directly did num1 - num2 is gives the error ask the questions
		System.out.println("Multiply: " + multiply);
		System.out.println("Division: " + division);
		System.out.println("square: "+ square);
		
		
		
		
	}
}
/*
 *Output:
		Enter the number: 
		5
		Enter the number: 
		5
		Addition: 10
		Subtract: 0
		Multiply: 25
		Division: 1
		square: 25
*/
