import java.util.Scanner;

public class Project_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		float g1;
		float  g2;
		float  g3;
		float  g4;
		float  g5;
		float average;
		
		System.out.println("What is your first grade percentage");
		g1 = userInput.nextFloat();
		
		System.out.println("What is your second grade percentage");
		g2 = userInput.nextFloat();
		
		System.out.println("What is your third grade percentage");
		g3 = userInput.nextFloat();
		
		System.out.println("What is your fourth grade percentage");
		g4 = userInput.nextFloat();
		
		System.out.println("What is your fifth grade percentage");
		g5 = userInput.nextFloat();
		
		average = (g1 + g2 + g3 + g4 + g5) /5; 
		//System.out.println("Mark 1: " + g1 + "\nMark 2: " + g2 + "\nMark 3: " + g3 + "\nMark 4: " + g4 + "\nMark 5: " + g5 + "\nYour average: " + average + ".");
		System.out.println(String.format( "%10s %5.2f", "Mark 1:", g1 ) );
		System.out.println(String.format( "%10s %5.2f", "Mark 2:", g2 ) );
		System.out.println(String.format( "%10s %5.2f", "Mark 3:", g3 ) );
		System.out.println(String.format( "%10s %5.2f", "Mark 4:", g4 ) );
		System.out.println(String.format( "%10s %5.2f", "Mark 5:", g5 ) );
		System.out.println(String.format( "%10s %5.2f", "Average:", average ) );
		userInput.close();
	}
}