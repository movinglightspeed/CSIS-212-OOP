package CommissionEmployee;
import Employee.*;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int month, int day,
			int year, double commissionRate, double grossSales) {
		super(firstName, lastName, socialSecurityNumber, month, day, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) //validate
			throw new IllegalArgumentException (
					"Commission rate must be > 0.0 and < 1.0");
		// TODO Auto-generated constructor stub
	
	
	if (grossSales < 0.0) 
		throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		}
	
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)  //validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
			this.grossSales = grossSales;
	}
	
	public double getGrossSales() {return grossSales;}
	
	//set commission rate
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <- 0.0 || commissionRate >= 1.0) 
			throw new IllegalArgumentException (
					"Commission rate must be > 0.0 and < 1.0");		
		this.commissionRate = commissionRate;
	}
	
	//return commission rate
	public double getCommissionRate() {return commissionRate;}
	
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	
	   // return String representation of CommissionEmployee object
	@Override
	 public String toString()
	   {
	       return String.format( "%s: %s %s\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
	          "commission employee", this.getFirstName(), this.getLastName(), 
	          "social security number", this.getSocialSecurityNumber(), 
	          "birthday",this.getbirthDate(),
	          "gross sales", getGrossSales(), 
	           "commission rate", getCommissionRate() );
	     } // end method toString	
	
	
	

}
