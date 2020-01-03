package SalariedEmployee;
import Employee.*;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
import java.util.Scanner;
import Date.*;
public class SalariedEmployee extends Employee {
private double weeklySalary;

//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, int month, int day,
			int year) {
		super(firstName, lastName, socialSecurityNumber, month, day, year);
		
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
		// TODO Auto-generated constructor stub
	}
	
	//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	
	//return salary
	public double getWeeklySalary() {return weeklySalary;} //multiply by four to get monthly value since it is processsed once per month
	
	//calculate earnings;override abstract method earnings in Employee
	@Override
	public double earnings() {return (4*getWeeklySalary());}
	
	//return String representation of SalariedEmployee object
	@Override
	   public String toString()
	   {
	      return String.format( "salaried employee: %s\n%s: $%,.2f", 
	         super.toString(), "weekly salary", getWeeklySalary() );
	   } // end method toString
}




