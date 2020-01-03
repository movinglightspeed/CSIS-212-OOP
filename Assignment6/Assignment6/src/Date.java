import java.util.Scanner;
//Assignment 6 Exercise 7.13 JHTP (Date Class)
public class Date {
	
//create instance variables
		private String month;
		private String day;
		private String year;
	
	//constructor initializes name with parameter month, day and year
	//method to set the month
	public void setMonth(String theMonth)
	{
		this.month = theMonth;
	}
	
	//method to set the day
	public void setDay(String day)
	{
		this.day = day;
	}
			
	//method to set the year
	public void setYear(String year)
	{
		this.year = year;
	}
	
	public String getMonth()
	{
		return month; //return value of month to caller
	}
	
	public String getDay()
	{
		return day; //return day of month to caller
	}
	
	
	public String getYear()
	{
		return year; //return value of year to caller
	}
	
	public static void main(String[] args) {
		
		System.out.println("Stanley Soman - Assignment 6 Exercise 7.13 JHTP Date Class\n"); // Heading
		
		// create a Scanner object to obtain input from the command window
		Scanner input =  new Scanner(System.in);

		//create an Date object and assign it to displayDate method
		Date displayDate = new Date();
		
		//prompt for month
		System.out.println("Please enter numeric month: ");
		String theMonth = input.nextLine();
		displayDate.setMonth(theMonth); //put theMonth in setMonth
		System.out.println(); //outputs blank line
		
		//prompt for day
		System.out.println("Please enter numeric day of month: ");
		String theDay = input.nextLine();
		displayDate.setDay(theDay); //put theDay in setDay
		System.out.println(); //outputs blank line
		
		//prompt for day
		System.out.println("Please enter year: ");
		String theYear = input.nextLine();
		displayDate.setYear(theYear); //put theYear in setDay
		System.out.println(); //outputs blank line
		
		//display dates
		System.out.printf("The date is: %n" + "%s" + "/" + "%s" + "/" + "%s", displayDate.getMonth(),displayDate.getDay(),displayDate.getYear());

	} //end main

} //end assignment
