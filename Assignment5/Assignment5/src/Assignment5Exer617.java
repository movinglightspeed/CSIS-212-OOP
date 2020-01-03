//Assignment 5 Exercise 6.17 (Dice Rolling)
import java.lang.reflect.Array;
import java.security.SecureRandom; //To use random class 
public class Assignment5Exer617 {
	
	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 5 Exercise 6.17 Dice Rolling \n"); // Heading
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		//declare variable array and initialize it with an array object
		int[] frequency = new int[7];// array of frequency counters
		int face1 = 0; //number on first die
		int face2 = 0; //number on second die
		int rolls;
		int totals = 0; //frequency of sums
		int freq2 = 0;
		int freq3 = 0;
		int freq4 = 0;
		int freq5 = 0;
		int freq6 = 0;
		int freq7 = 0;
		int freq8 = 0;
		int freq9 = 0;
		int freq10 = 0;
		int freq11 = 0;
		int freq12 = 0;
		
		//roll die 36,000 times; use die value as frequency index
		for (rolls = 1; rolls <= 36000; rolls++) {
			++frequency[1 + randomNumbers.nextInt(6)];  //in case we need to track how many frequencies of each die face
			face1 = 1 + randomNumbers.nextInt(6); //each die random roll
			face2 = 1 + randomNumbers.nextInt(6); //each die random roll
			totals = face1 + face2; //sum of both random rolls
			System.out.printf("\n%s%7s%15s%n", "Die 1", "Die 2", "Sum of Dice"); //print those values
			System.out.printf("%3d%7d%12d%n", face1, face2, totals); //use our values while still in for loop
		
		//for each roll case with summed integers, store them from our for loop
		switch (totals) {
		case 2:
			++freq2;
			break;
		case 3:
			++freq3;
			break;
		case 4:
			++freq4;
			break;
		case 5:
			++freq5;
			break;
		case 6:
			++freq6;
			break;
		case 7:
			++freq7;
			break;
		case 8:
			++freq8;
			break;
		case 9:
			++freq9;
			break;
		case 10:
			++freq10;
			break;
		case 11:
			++freq11;
			break;
		case 12:
			++freq12;
			break;			
		} //end of switch
	} //end of for loop
		
		//one-dimensional arrays with stored switch values
		int[] sumarray = {freq2, freq3, freq4, freq5, freq6, freq7, freq8, freq9, freq10, freq11, freq12};
		//one-dimensional array of our integer sums
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};		
		
		//Heading of tabular data
		System.out.printf("\n%15s\t%15s", "Sum of Dies", "Number of Frequencies");
		
		//print all the numbers in the array
		for (int countingup = 0; countingup < sumarray.length; countingup++)
		System.out.printf("\n%10d\t%14d%n", numbers[countingup], sumarray[countingup]); 

	}//end main

} //end assignment
