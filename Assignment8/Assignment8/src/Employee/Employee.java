package Employee;
import Date.*;

//Assignment 8 Exercise 10.12 JHTP (Payroll Modification)
public abstract class Employee {
	//Employee Abstract Superclass	
		private String firstName;
		private String lastName;
		private String socialSecurityNumber;
		private Date birthDate;
		
		//constructor
		public Employee (String firstName, String lastName, String socialSecurityNumber, int month, int day, int year) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			this.birthDate = new Date(month, day, year);
		} //end six-argument Employee constructor
		
		//set first name
		public void setfirstName (String firstName)
		{
			this.firstName = firstName;
		}
		
		//return first name
		public String getFirstName() {
		return this.firstName;
		}

		//set last  name
		public void setlasttName (String lastName)
		{
			this.lastName = lastName;
		}
		//return last name
		public String getLastName() {return 
			this.lastName;
		}

		//set birthdate
		public void setbirthDate (int month, int day, int year)
		{
			this.birthDate = new Date(month, day, year);
		}
	

		//return birthDate
		public Date getbirthDate() {
		return this.birthDate;
		}
		
		//return month
		public Date getMonth() {
			return getMonth();
		}
	
		//set ssn
		public void setSocialSecurityNumber (String socialSecurityNumber)
		{
			this.socialSecurityNumber = socialSecurityNumber;
		}
		
		//return social security number
		public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
		}
		
		
		//return String representation of Employee object
		@Override
		public String toString()
		{
			return String.format("%s %s\nsocial security number: %s\nbirthday: %s",getFirstName(),getLastName(),getSocialSecurityNumber(),getbirthDate());
		}
		

		public abstract double earnings(); //no implementation

} // end abstract employee


