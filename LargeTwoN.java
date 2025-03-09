//Write a java program to find the largest of two no using relational operators.
public class LargeTwoN 
{
	public static void main(String args[])
		{
			int a= 20;
			int b= 35;
			int large = a*(a < b ? 1:0) + b*(a > b ? 1:0); // 20 *(20 > 35 ? 1:0 ) + b* (20 < 35 ?1:0);
			System.out.println("Largest no: " + large);
		}
}


/*Second way 
  public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 25, num2 = 40;

        int largest = num1 ^ ((num1 ^ num2) & -(num1 < num2 ? 1 : 0));
        System.out.println("The largest number is: " + largest);
    }
}
/*
3d way to Using ternory ope.

public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 25, num2 = 40;

        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("The largest number is: " + largest);
    }
}
*/

/* 4th way using if-else 
 public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 25, num2 = 40;

        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
}
 */
