//Write a java program to check whether a person is eligible to vote (age should be 18 or above).
public class EVoting
{
	 public static void main(String args[])
	 {
		int age=21;
		boolean result= (age >= 18);  //Here we not taking the String or other data type
		 
		System.out.println("Eligibility for Voting: " + result);
		 
	 }
}
/* Output :
	Eligibility for Voting: true
*/
