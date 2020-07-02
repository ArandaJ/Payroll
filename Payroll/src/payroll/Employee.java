package payroll;
/** 
* @author Juan Aranda
* Student ID: 991573740
* Assignment 4: Payroll Application
* 
* Program takes in up to 100x employee Name, Worked Hours & Rate
* Prints out each staff payment and payroll total
**/

public class Employee
{
	private String name;
	private int hours;
	private double wage;

	/*
	* Constructor that takes in all user inputs
	*/
	public Employee(String givenName, int givenHours, double givenWage)
	{
		name = givenName;
		hours = givenHours;
		wage = givenWage;
	}


	/*
	* Accesors: Name, Hours, Wage
	*/
	public String getName()
	{
		return name;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public double getWage()
	{
		return wage;
	}
	
	/*
	* Mutators: Name, Hours, Wage
	*/
	public void setName(String givenName)
	{
		name = givenName;
	}
	
	public void setHours(int givenHours)
	{
		hours = givenHours;
	}
	
	public void setWage(double givenWage)
	{
		wage = givenWage;
	}
	
	/*
	* Employee payment calculator method
	*/
	public double getPayment(int hours, double wage)
	{
		double payment = hours * wage;
		return payment;
	}
}//end class