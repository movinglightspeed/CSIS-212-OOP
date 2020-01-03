//Assignment 3 Exercise 5.20 (Circle Area)
import java.util.Scanner; 
public class Assignment4Exercise520 {

	public static void main(String[] args) {
		System.out.println("Stanley Soman - Assignment 4 Exercise 5.20 Circle Area \n"); // Heading
		
		//create scanner for input
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter radius of a circle: "); 
		double radius = input.nextDouble(); //take radius input
		double area = areacalculation(radius); //take areacalculation method
		System.out.print("Area of circle :" + area); //simple calculatin
}
	
		//circle method with double argument
		public static double areacalculation(double radius)	{ //we used double for precise answer
			return (Math.PI*radius*radius); //use built in math function to calculate radius twice
		}
}
