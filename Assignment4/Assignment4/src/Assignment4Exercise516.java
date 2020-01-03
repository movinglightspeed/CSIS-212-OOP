import java.util.Scanner; //import scanner

//Assignment 4 Exercuse 5.16 JHTP
public class Assignment4Exercise516 {

	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 4 Exercise 5.16 JHTP\n"); // Heading
		
		Scanner input = new Scanner ( System.in ); //open prompt for number
		
		int first; //the first number
		int second; // the second number
		
		System.out.print("Enter first number (0 to exit): ");
		first = input.nextInt();
		
		//use 0 as the sentinel value, since we cannot divide by zero
		while (first != 0)
		{ 
			System.out.print( "Enter second number: ");
			second = input.nextInt();
			
			if ( multiple( first, second))
				System.out.printf( "%d is a multiple of %d\n\n", second,first);
			
			else
				System.out.printf ("%d is not a multiple of %d\n\n", second,first);
			System.out.print("Enter first number (0 to exit): ");
			first = input.nextInt();
			
		} //end while loop
		
	} //end main

	//determine if first int is a multiple of the second
	public static boolean multiple ( int firstNumber, int secondNumber)
	{
		return secondNumber % firstNumber == 0;
	} // end method multiple
} //end class Multiplicity
