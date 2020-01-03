//Assignment 3 Exercise 5.35 (Computer-Assisted Instruction)
import java.security.SecureRandom; // program uses class SecureRandom
import java.util.Scanner; // import scanner
public class Assignment4Exercise535 {

	public static void main(String[] args) { //main 
		System.out.println("Stanley Soman - Assignment 4 Exercise 5.35 Computer-Assisted Instruction \n"); // Heading
		SecureRandom randomNumbers = new SecureRandom();
		// randomNumbers object will produce secure random numbers
		
		//create scanner for input
		Scanner input = new Scanner(System.in);		
					
		// pick 1 to 9 random integers
		for (int loop = 1; loop <= 9;loop++) { //9 loops to cover 9 digits
			int number1 = 1 + randomNumbers.nextInt(9); // 1 digit integer
			int number2 = 1 + randomNumbers.nextInt(9); // 1 digit integer
			
			System.out.printf("\nHow much is %d times %d\n ", number1,number2); //prompt the user
			int inputanswer = input.nextInt(); //grab their answer
			
			final int randomnumberproduct = number1 * number2;  //random numbers multiplied
			final int storedinput = inputanswer; //transfer stored input to value
			
			if ( (randomnumberproduct) == storedinput) { //if answer & calculation is equal
				correctanswer(); //call method to let user know
			}
				else 
				while ((randomnumberproduct) != storedinput) { //as long as they are not equal
				System.out.print("No. Please try again."); //we let them know
				System.out.printf("How much is %d times %d \n ", number1,number2); //we want right answer
				inputanswer = input.nextInt(); //we prompt again endless while loop
				if ( (randomnumberproduct) == storedinput) { //but if right answer we break out of while condition
					correctanswer();
					}
				}
			} //end for loop
	} //end main
	
	public static void correctanswer () { //our second method
		System.out.print("Very Good!"); 	 //  executed each time question is answered correctly
	} //end second method
			
	}//end assignment class