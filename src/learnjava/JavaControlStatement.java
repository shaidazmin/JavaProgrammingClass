package learnjava;

import java.util.Scanner;

public class JavaControlStatement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Fav Team Name : ");
		String favTeamName =input.nextLine();
		
		System.out.println("Enter Your Fav Team Result : ");
		
		boolean matchResult = input.nextBoolean();
		
		if(matchResult == true) {
			System.out.println("Your team are now round 8");
			System.out.println("Enter Your Fav Team Result : ");
			matchResult = input.nextBoolean();
			if(matchResult == true) {
				System.out.println("Your team are now round 4");
				System.out.println("Enter Your Fav Team Result : ");
				matchResult = input.nextBoolean();
				if(matchResult == true) {
					System.out.println("Your team are now in final");
					System.out.println("Enter Your Fav Team Result : ");
					matchResult = input.nextBoolean();
					if(matchResult == true) {
						System.out.println("Congratulations your team own the world cup");
					}
					else {
						System.out.println(favTeamName+" team loss world cup 2022 Good luck for nex world cup");
					}
				}else {
					System.out.println("Your team are out of worldcup from round 4");
				}
			}
			else {
				System.out.println("Your team are out of worldcup from round 8");
			}
		}
		else {
			System.out.println("Your team are out of worldcup from round 16");
		}
		
		
		
		
		
//		int number = 36;
		//Using ternary operator
		//String output = ;
		
//		System.out.println((number % 2 == 0) ? "even number" : "odd number");
		
//		if(number % 2 == 0) {
//			System.out.println("even number");
//		}else {
//			System.out.println("odd number");
//		}
		
	
		
//		System.out.println("Enter Your GPA : ");
//		float gpa = input.nextFloat();
		
//		String name = "Azmin";
//		int present = 0;
//		
//		System.out.println("Your name");
//		
//		String presentEmployee = input.nextLine();
//		
//		if(presentEmployee.equals(name)) {
//			present++;
//			System.out.println(presentEmployee + " is presnet");
//		}else {
//			System.out.println(presentEmployee + " is absent");
//		}
//		
//		
//		System.out.println(presentEmployee + " is attend for "+ present + " days");
		

	}

}
