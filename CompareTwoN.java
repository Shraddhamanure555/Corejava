//Write a java program to compare  two ni using ==, !=, >,< >=,<= and display the result 
public class CompareTwoN 
{

	public static void main(String args[])
		{
			byte num = 20;
			byte num2 = 50;
			
			System.out.println(num == num2);// check both side value Result: false
			System.out.println(num < num2); // it check the LESS no of two value Result: true
			System.out.println(num > num2);// here the value is grater than num i.e Result : false
			System.out.println(num <= num2);//true
			System.out.println(num >= num2);// false
		}
}

