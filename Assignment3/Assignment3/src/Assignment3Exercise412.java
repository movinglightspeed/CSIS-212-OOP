//Assignment 3 Exercise 4.12 Application that Calculates Product of Odd Integers from 1 to 15
public class Assignment3Exercise412 {

	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 3 Exercise 4.12\n"); // Heading
		int oddintegerscount = 0; // initialize
		int product = 1; // start with one so that first calculation goes through or times zero is always zero
		
		//For loop to count every odd integer and multiply them
		for (oddintegerscount = 1; oddintegerscount <= 15 ; oddintegerscount+=2) { // start count with 1, end at 15, increment up every 2 numbers to stay odd integers
			product *= oddintegerscount; // every loop take the count of odd integers multiply and then store the result
	    }
		
		System.out.printf("The product of odd integers from 1 to 15 is %d%n", product); // print out the calculations
	} // end main
} //end assignment 3 exercise 4.12
  