package HourlyEmployee;
import Employee.*;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	//constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, int month, int day, int year) {
		super(firstName, lastName, socialSecurityNumber, month, day, year);
		
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");	
	
	if ((hours < 0.0) || (hours > 168.0)) 
		throw new IllegalArgumentException (
				"Hours worked must be >= 0.0 and <= 168.0");
	this.wage = wage;
	this.hours = hours;
	}
	
	//set wage
	public void setWage(double wage) {
		if (wage < 0.0) //validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.wage = wage;		
	}
	
	//return wage
	public double getWage() {return wage;}
	
	//set hours worked
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) //validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		this.hours = hours;
	}
	
	//return hours worked
	public double getHours() {return hours;}
	
	@Override
	public double earnings() {
		if (getHours() <= 40)
			return 4*(getWage() * getHours()); //Multiply by 4 to get Monthly earned number for the hourly employee
		else
			return 4*(40 * getWage() + (getHours() - 40) * getWage() * 1.5);
		
	}
	
	   // return String representation of HourlyEmployee object
	@Override
     public String toString()
	   {
		    return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
		    super.toString(), "hourly wage", getWage(), 
		    "hours worked", getHours() );
	  } // end method toString
	
} //end class HourlyEmployee
