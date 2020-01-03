import Employee.*;
import SalariedEmployee.*;
import HourlyEmployee.*;
import CommissionEmployee.*;
import BasePlusCommissionEmployee.*;
import Date.*;
import java.util.Scanner; //program uses Scanner to obtain user input
public class PayrollSystem {	
	//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
	public static void main(String[] args) //main program
	{
		SalariedEmployee salariedEmployee = new SalariedEmployee ("John","Smith","111-11-1111",800.00, 05, 15, 1915);
		HourlyEmployee hourlyEmployee = new HourlyEmployee ("Karen","Price","222-22-2222",16.75, 40, 02, 18, 1992);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","333-33-3333",03,12,1962,.04,800);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",3,2,1965,.05,200,5000);
		System.out.println("Stanley Soman - Assignment 8 Exercise 10.12 JHTP (Payroll Modification) \n"); // Heading
		System.out.println("Employees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned",salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee,"earned",hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee,"earned",commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());
		
		//create four-element Employee Array
		Employee[] employees = new Employee[4];
		
		//initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		Scanner input = new Scanner (System.in); // to get current month
		int currentMonth;
		
		//get and validate current month
		do
		{
			System.out.print("Enter the current month (1-12):");
			currentMonth = input.nextInt();
			System.out.println();
		} while ((currentMonth <1) || (currentMonth > 12));
		
		System.out.println("Stanley Soman - Assignment 8 Exercise 10.12 JHTP (Payroll Modification) \n"); // Heading
		System.out.printf("Employees processed polymorphically:%n%n");
		
	    // generically process each element in array employees
	      for ( Employee currentEmployee : employees ) 
	      {
	         System.out.println( currentEmployee ); // invokes toString

	         // determine whether element is a BasePlusCommissionEmployee
	         if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
	         {
	            // downcast Employee reference to 
	            // BasePlusCommissionEmployee reference
	            BasePlusCommissionEmployee employee = 
	               ( BasePlusCommissionEmployee ) currentEmployee;

	            double oldBaseSalary = employee.getBaseSalary();
	            employee.setBaseSalary( 1.10 * oldBaseSalary );
	            System.out.printf( 
	               "new base salary with 10%% increase is: $%,.2f\n",
	               employee.getBaseSalary() );
	         } // end if
	         
	         //$100 bonus
	         if (currentMonth == currentEmployee.getbirthDate().getMonth())
	         System.out.printf( 
	            "earned $%s, %s\n\n", currentEmployee.earnings(),
	         	"plus $100.00 birthday bonus");
	         else
	        	 System.out.printf(
	        			 "earned $%,.2f\n\n",currentEmployee.earnings());
	      } // end for

	      // get type name of each object in employees array
	      for ( int j = 0; j < employees.length; j++ )
	         System.out.printf( "Employee %d is a %s\n", j, 
	            employees[ j ].getClass().getPackageName());
	   } // end main
	} // end class PayrollSystemTest