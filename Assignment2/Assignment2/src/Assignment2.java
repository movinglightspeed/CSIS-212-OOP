//Assignment2 -- This is assignment two
import java.util.Scanner; // program imports the scanner to input employee data

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 2\n"); // Heading
		
		//Exercise 3.20 JHTP (Salary Calculator)
		
		// create scanner to obtain salary information
		Scanner input = new Scanner(System.in);

		//gross pay init
		double totalpay = 0;

		//For three employees counter
		int employeecounter = 1;
		
		//Process the salary calculations
		while (employeecounter <= 3) // For three employees loop 3 times
		{ 
			System.out.print("Enter the hourly rate: "); // prompt for employee rate
			double hourly = input.nextDouble(); // We want to use double to get the exact value
			
			System.out.print("Enter hours worked "); // prompt for hours worked
			double totalhrs = input.nextDouble(); // hours should be double to prevent compilation errors
			
			//overtime code
			if (totalhrs > 40) {
				double over40 = totalhrs - 40; //if its over 40 hours, we just subtract 40 from that to find out how much over we worked
				totalpay = ( 40 * hourly ) + (over40 * hourly * 1.5); // get normal pay + our overtime hrs times time and half
			}
			else totalpay = totalhrs * hourly; // if not we get normal pay
			System.out.printf("Pay for employee %d is $%.2f%n", employeecounter, totalpay);
			//Alternate way
			//System.out.println("Pay for employee " + employeecounter + " is " + "$" + totalpay); // Use ln for natural line skipping
			employeecounter = employeecounter + 1; //onto the next employee
		} // end our while loop
		
	} //end main

} // end assignment 2
