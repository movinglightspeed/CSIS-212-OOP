//Assignment 5 Exercise 6.14 (Variable-Length Argument List)
import java.security.SecureRandom; //import java package to generate random numbers
public class Assignment5Exer614 {

	public static void main(String[] args) { //main
		System.out.println("Stanley Soman - Assignment 5 Exercise 6.14 Variable-Length Argument \n"); // Heading
		SecureRandom randomNumbers = new SecureRandom(); 
		// randomNumbers object will produce secure random numbers
		
		//declare variable array and initialize it with an array object
		int[] array = new int[10]; 		
		
	
		System.out.printf("%s%10s%n", "Calls","Products");  // column headings
		for (int counter = 0; counter < array.length; counter++) { //we want to loop up to array number length
			array[counter] = (1 + randomNumbers.nextInt(9)) * (1 + randomNumbers.nextInt(9)); // take product of integers
			//output each array element's value
			System.out.printf("%5d%8d%n", counter, array[counter]); //print all calls we should be using dif number of arguments due to random class
		} //end for loop
	} //end main
} //end assignment
//= counter *+