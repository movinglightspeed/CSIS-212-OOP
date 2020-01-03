import javax.swing.JOptionPane; //import JOptionPane to take input 
import java.util.Arrays; //import Arrays Java
public class FinalAssignment1 {

	public static void main(String[] args) {
		//first array holds four-digit student id
		String[] studentidarray = new String[] {"1234","4321","6287","7826","9999","1111","2222","3333","4444","5555"};
		
		//second array holds first name
		String[] firstnamesarray = new String[] {"Stanley","Max","Mark","John","Luke","Matthew","Trevor","Charlie","Winston","Paul"};
		
		//third array holds students GPA
		double[] gpaarray = {4.0,3.2,3.8,3.5,3.9,3.6,2.0,2.8,3.0,2.6,};
		
		System.out.println("Stanley Soman - Final Project Assignment Part 1\n"); // Heading
		
		//Dialog box to accept new student ID and display student's first name and GPA.	
		String studentid = JOptionPane.showInputDialog("What is the student's ID?");
		
		//While loop, if cancel is clicked then loop stops
		while (studentid != null)
		{
			//search studentidarray for studentid
			int searchindex = Arrays.binarySearch(studentidarray, studentid);
			
			//binarysearch returns greater than 
			if (searchindex >= 0) 
				System.out.printf("Student's name: %s%nGPA: %.2f%n", firstnamesarray[searchindex],gpaarray[searchindex]);
			else
				//no match, display error INVALID ID number, search for new ID 
				System.out.printf("%nStudent ID %s not found, please try again.%n%n", studentid);
				studentid = JOptionPane.showInputDialog("What is the student's ID?");
		}
		
	}
}
