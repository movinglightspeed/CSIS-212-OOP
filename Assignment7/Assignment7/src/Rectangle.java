import java.util.Scanner; //import scanner to take input
//Assignment 7 Exercise 8.4 JHTP (Rectangle Class)
public class Rectangle {

	//create instance variables
	private double length; //we want numbers 1-19
	private double width; //we want numbers 1-19

	//Rectangle constructor with two parameters
	public Rectangle (double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	//set default values
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
		}
	
	//method to setLength
	public void setLength (double length) {
		
		if (length < 1 || length >= 20)  //if it is less than 1 then throw error or greater than 19
		{
			throw new IllegalArgumentException("Length was out of range");
		}
		this.length = length;
	}
	
	//method to setWidth
	public void setWidth (double width) {
		if (width < 1 || width >= 20) //if it is less than 1 then throw error or greater than 19
	{
		throw new IllegalArgumentException("Width was out of range");
	}
		this.width = width;
	}
	
	//method to retrieve the length
	public double getLength()
	{
		return this.length;
	}
	
	//method to retrieve the width
	public double getWidth()
	{
		return this.width;
	}
	
	//method to calculate the perimeter
	public double perimeter()
	{
		return (2 * this.getLength()) + (2 * this.getWidth()); //calculate using the get methods
	} //end method perimeter
	
	
	//method to calculate the area
	public double area()
	{
		return this.getLength() * this.getWidth(); //calculate using the get methods
	} //end method area
	
	
	//return String representation of stored values
	public String toString()
	{
		return "Length: " + this.length + "\tWidth: " + this.width + "\tPerimeter: " + perimeter() + "\tArea: " + area();
		//the \t is used to tab each answer
		}
	

	//begin main
	public static void main(String[] args) {
		
		System.out.println("Stanley Soman - Assignment 7 Exercise 8.4 JHTP Rectangle Class\n"); // Heading
		
		//Scanner input
		Scanner input = new Scanner( System.in );
		
		Rectangle rectangle = new Rectangle(); //create new object
		
		int choice = getMenuChoice(); //get choice number from input in the menu method
		
		//with retrieved number from method check each case using switch
		while ( choice != 3) { //keep prompting until they choose to exit
			switch (choice) {
			case 1:
				System.out.print("Enter length: ");
				rectangle.setLength(input.nextDouble());
				break;
			case 2:
				System.out.print("Enter width: ");
				rectangle.setWidth(input.nextDouble());
				break;
			} //end switch
			
			System.out.println (rectangle.toString()); //method that retrieves stored string calculation values
			
			choice = getMenuChoice(); //while loop still running get menu again
			
		} //end while loop
		
	} //end main
	
	//method for our menu
	private static int getMenuChoice()
	{
		Scanner input = new Scanner( System.in );
		System.out.println("1. Set Length");
		System.out.println("2. Set Width");
		System.out.println("3. Exit");
		System.out.print("Choice ");
		
		return input.nextInt();
	} //end method getMenuChoice

} //end class Rectangle
