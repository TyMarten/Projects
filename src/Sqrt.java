import java.util.Scanner;
/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		double number;
		double numberSqrt;
		
	
		do{ 
			System.out.println("Please insert a positive number");
			number = userInput.nextDouble();
			numberSqrt = Math.sqrt(number);
			
			if (number <= 0){
				System.out.println("That in not positive");
			}
		}
		
		while (number <= 0);	
		System.out.println("The square root of your number is " + numberSqrt + ".");
		userInput.close();
	}	
}
