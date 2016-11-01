import java.util.Scanner;

public class Project_1_2 {

	
	public static void main(String[] args) {
	
		
		Scanner userInput = new Scanner(System.in);
		
		String fName;
		String lName;
		float studentID;
		String logIn;
		float avgG;
	
		System.out.println("Hello there, whats your name again.");
		fName = userInput.next();
		
		System.out.println("Ok, what about your last name.");
		lName = userInput.next();
		
		System.out.println("So " + fName + " " + lName + " what is your Student Id");
		studentID = userInput.nextFloat();
		
		System.out.println("What is your password to log in to your computer");
		logIn = userInput.next();
		
		System.out.println("What is your average from the average program");
		avgG = userInput.nextFloat();
		
		System.out.println(String.format("%-16s %-20s  ", "Name: ", lName + ", " + fName) );
		System.out.println(String.format("%-16s %-10f", "StudentID: ", studentID) );		
		System.out.println(String.format("%-16s %-10s", "logIn: ", logIn) );
		System.out.println(String.format("%-16s %-1.2f %%" , "Average Grade: ", avgG ) );
										
		userInput.close();
	}
}