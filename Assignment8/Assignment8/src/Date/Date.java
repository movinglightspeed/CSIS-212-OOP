package Date;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
public class Date {
		private int month; // 1-12
		private int day; //1-31
		private int year; //any year
		
		private final int[] daysPerMonth = 
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//constructor: confirm proper value for month and day given the year
		public Date (int month, int day, int year) {
		//check if month in range
		if (month <=0 || month > 12)
			throw new IllegalArgumentException (
					"month (" + month + ") must be 1-12"); 
		
		
		if (day <=0 || (day > daysPerMonth[month] && !(month == 2 && day == 
				29)))		
		throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
	
	
		//check for leap year if month is 2 and day is 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");
		
		this.month = month;
		this.day = day;
		this.year = year;
	} //end Date
	
		//return day
		public int getDay() {
			return this.day;
		}
		
		//return month
		public int getMonth() {
			return this.month;
		}
		
		//return year
		public int getYear() {
			return this.year;
		}
		
		@Override
		public String toString()
		{
			return String.format("%d/%d/%d",getMonth(),getDay(),getYear());
		}
	} //end date
