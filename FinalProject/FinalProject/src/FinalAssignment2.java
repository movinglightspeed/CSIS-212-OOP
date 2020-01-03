import java.util.Scanner; //import input scanner
public class FinalAssignment2 {
	
	//enumeration with days of the week
	private enum DaysofWeek {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //scanner object
		
		System.out.println("Stanley Soman - Final Project Assignment Part 2\n"); // Heading
		
		//array holding business hours
		String[] businesshours = new String[] {"8am-5pm","6am-1am","7am-2pm","9am-5pm","10am-6pm","11am-7pm","8:30am-3:30pm"};
	
		DaysofWeek thisday; // Will contain values of Enumeration
		
		int choice = daysofweek(); //get choice number from menu
		
		//while loop
		while (choice != 8) { 
		switch (choice) {
		case 1:
			//call ENUM value
			thisday = DaysofWeek.Sunday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[0]);
			break;
		case 2:
			//call ENUM value
			thisday = DaysofWeek.Monday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[1]);
			break;
		case 3:
			//call ENUM value
			thisday = DaysofWeek.Tuesday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[2]);
			break;
		case 4:
			//call ENUM value
			thisday = DaysofWeek.Wednesday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[3]);
			break;
		case 5:
			//call ENUM value
			thisday = DaysofWeek.Thursday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[4]);
			break;
		case 6:
			//call ENUM value
			thisday = DaysofWeek.Friday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[5]);
			break;
		case 7:
			//call ENUM value
			thisday = DaysofWeek.Saturday;
			//Print business hours and enum value
			System.out.printf("%nBusiness Schedule on %s%n", thisday);
			System.out.printf("Hours: %s%n",businesshours[6]);
			break;
		} //end switch		
		choice = daysofweek();
		//present menu while in loop
		} //end while loop
		
} //end main
	
	private static int daysofweek()
	{
		Scanner input = new Scanner( System.in );
		System.out.printf("%nFind Business Hours For the Week%n");
		System.out.println("1. Sunday");
		System.out.println("2. Monday");
		System.out.println("3. Tuesday");
		System.out.println("4. Wednesday");
		System.out.println("5. Thursday");
		System.out.println("6. Friday");
		System.out.println("7. Saturday");
		System.out.println("8. Exit");
		System.out.print("Choice: ");
		
		return input.nextInt();
	} //end method getMenuChoice

}
