import java.util.Scanner;

public class Age_Else_If {
 
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int age;
	
		System.out.println("how old are you ");
		age = userInput.nextInt();
		while(age > 10);
			if (age <= 15 ){
			System.out.println("you are too young to drive");
			}	
			
			else if (age >= 16 && age < 18 ){	
			System.out.println("You can dirve but not vote... legally");
			}
			
			else if (age >= 18 && age < 25){
			System.out.println("you can drive and vote but not rent a car");
			}
			
			else { 
			System.out.println("You can do anything pretty much"); 
		}
	}
}