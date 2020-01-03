//Assignment 3 Exercise 4.16 JHTP (Bar Chart Printing Program)
import java.util.Scanner; // we will be using this java class to input numbers
public class Assignment3Exercise416 {

	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 3 Exercise 4.16 Bar Chart Printing Program \n"); // Heading
		
		Scanner input = new Scanner(System.in); // create scanner to get input
		
		//initialize numbers
		int number1 = 0; 
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		
		//
		int asteriks = 0;
		
		//this is our common looping variable 
		int fivenumbers = 1;
		
		//what we call our input value
		int inputinteger = 0;

		//prompt user
		System.out.printf("%s%n", "Enter five numbers between 1-30");
		
		//while has two conditions both of which is true for while to run
		while (fivenumbers <=5 && input.hasNext()) { // For five numbers
			inputinteger = input.nextInt(); // store the input number in a variable
			if (inputinteger >= 1 && inputinteger <= 30) { //store each input number but dont print yet
				switch (inputinteger) { // 5 switch cases
				case 1:
					number1 = inputinteger; //take the inputted number and store it
				break; 
				case 2:
					number2 = inputinteger;//take the inputted number and store it
				break;
				case 3:
					number3 = inputinteger; //take the inputted number and store it
				break;
				case 4:
					number4 = inputinteger;//take the inputted number and store it
				break;
				case 5:
					number5 = inputinteger;//take the inputted number and store it
				break;
				} //end switch
				fivenumbers++; //do it five times
			} //end if
			else 
				System.out.printf("You need to pick a number between 1 and 30."); //let user know they have to choose
		    } //end while
		
		//Numbers to Asterisk Conversion
		//Loop through our five numbers
		for (fivenumbers = 1; fivenumbers <= 5; fivenumbers++) {
			switch (fivenumbers) //we run through just five loops, nothing special
			{
			case 1:
				asteriks = number1; //move our stored numbered values to a one variable for easy looping
				break; // break each time to run asteriks loop
			case 2:
				asteriks = number2; //move our stored numbered values to a one variable for easy looping
				break; // break each time to run asteriks loop
			case 3:
				asteriks = number3; //move our stored numbered values to one variable for easy looping
				break; // break each time to run asteriks loop
			case 4:
				asteriks = number4; //move our stored numbered values to a one variable for easy looping
				break; // break each time to run asteriks loop
			case 5:
				asteriks = number5; //move our stored numbered values to a one variable for easy looping
				break; // break each time to run asteriks loop
			}
	   // For every break in switch above we run the following loop below
		for (int numberofasteriks = 1; numberofasteriks <= asteriks; numberofasteriks++) 
			System.out.print("*"); //we loop as many asteriks till its equal to asteriksvalue
			System.out.println(); //gives us linebreak
			} //After break ended, we run back to get the next number and print more asterisk for next number
		
	} //end main
} //end assignment 3
