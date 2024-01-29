import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello please type your first and last name below!");
		
		//This line will read for the full name
		
		String fName = scan.nextLine();
		
		System.out.println("Hello " + fName + " Please type your age in years below.");
		
		//This line will scan for that age in years
		
		double ageY = scan.nextDouble();
		
		//Age in months(AgeM) is just age in years(AgeY) * 12
		
		double ageM = (ageY)*12;
		
		System.out.println(fName + " " + "your around " + ageM + " " + "months old!");
		
	}

}