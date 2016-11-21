import java.util.Scanner;

/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class SpaceWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int weight;
		String planet;
		
		
		System.out.println("If you dont mind me asking how much do you weigh on the planet earth in pounds?");
		weight = userInput.nextInt();
		
		System.out.println("ok please pick a celestial body");
		planet = userInput.next();
		
		
		if(planet.equalsIgnoreCase("Mercury") ){
			System.out.println("Your weight on Mercury is " + weight * .38 + ".");
		}
			
		if(planet.equalsIgnoreCase("Venus") ){
			System.out.println("Your weight on Venus is " + weight * .91 + ".");
		}
			
		if(planet.equalsIgnoreCase("Earth") ){
			System.out.println("Your weight on Earth is " + weight * 1 + ".");
		}
			
		if(planet.equalsIgnoreCase("Moon") ){
			System.out.println("Your weight on  the Moon is " + weight * .165 + ".");
		}
			
		if(planet.equalsIgnoreCase("Mars") ){
			System.out.println("Your weight on Mars is " + weight * .38 + ".");
		}
			
		if(planet.equalsIgnoreCase("Jupiter") ){
			System.out.println("Your weight on Jupiter is " + weight * 2.34 + ".");
		}
		
		if(planet.equalsIgnoreCase("Saturn") ){
			System.out.println("Your weight on Saturn is " + weight * 1.06 + ".");
		}						
		
		if(planet.equalsIgnoreCase("Uranus") ){
			System.out.println("Your weight on Uranus is " + weight * .92 + ".");
		}						
		
		if(planet.equalsIgnoreCase("Neptune") ){
			System.out.println("Your weight on Neptune is " + weight * 1.19 + ".");
		}						
		
		if(planet.equalsIgnoreCase("Pluto") ){
			System.out.println("Your weight on Pluto is " + weight * .06 + ".");
		}						
		
	}

}
