package BasePlusCommissionEmployee;
import CommissionEmployee.*;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
public class BasePlusCommissionEmployee extends CommissionEmployee {
	public double baseSalary; //base salary per weeek
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int month,
			int day, int year, double commissionRate, double grossSales, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, day, year, commissionRate, grossSales);
		// TODO Auto-generated constructor stub
		
		if (baseSalary < 0.0) 
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) 
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	//return base salary
	public double getBaseSalary() {return baseSalary;}
	
	
	//calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings() {return getBaseSalary() + super.earnings();}
	
	
	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString()
	{
		return String.format( "%s %s; %s: $%,.2f", 
				"base-salaried", super.toString(), 
				"base salary", getBaseSalary() );
	} // end method toString   
	

	
	//constructor

}
