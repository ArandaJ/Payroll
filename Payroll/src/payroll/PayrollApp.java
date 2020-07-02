package payroll;
import java.util.Scanner;
/** 
* @author Juan Aranda
* Student ID: 991573740
* Assignment 4: Payroll Application
* 
* Program takes in up to 100x employee Name, Worked Hours & Rate
* Prints out each staff payment and payroll total
**/

public class PayrollApp
{
	public static void  main(String[] args)
	{
		System.out.println("Welcome to the Payroll Application.");
		PayrollApp pay = new PayrollApp();
		pay.run();
	}
	
	private void run()
	{
		Scanner sc = new Scanner(System.in);		//scanner loaded
		boolean cont = true;						//continue adding employees? true/false
		Employee[] employees = new Employee[100];	//100 index array initiated
		int index = 0;								//index count
		double payroll = 0;							//payroll variable (sum of all employees payments)
		
		PayrollApp pay = new PayrollApp();			//PayrollApp loaded
		
		/*
		* Loop to continuously take user inputs (Name, Hours, Wage) until user set variable const to false
		*/
		do
		{
		System.out.println("Please enter the Employee's name:");
		String name = sc.nextLine();
		System.out.println("Please enter the Employee's number of hours worked as a number:");
		int hours = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter the Employee's hourly wage:");
		double wage = Double.parseDouble(sc.nextLine());
		
		Employee emp = new Employee(name, hours, wage);		//emp Object created
		employees[index] = emp;								//emp saved on employees[] array index 0
		index++;											//index counter increased by 1, ready for next instance
		
		System.out.println("Would you like to enter another employee (yes or no)?");
		String another = sc.nextLine();
		
		/*
		* If condtion to run when user decide not to enter more employees
		*/
		
		if (another.equals("no"))
		{
			//boolean cont is set to false to terminate do-while loop
			cont = false;
			//for loop iniciated to iterate thru employees array while printing out employee name/payment info
			for(int i=0; i<index; i++)	
			{
				// payment canculated and printed via printStatement method
				double payment = emp.getPayment(employees[i].getHours(), employees[i].getWage());
				pay.printStatement(employees[i].getName(), payment);
				// every staff payment is added to payroll variable 
				payroll=+payment;
			}
		}
		}while(cont == true);
		// payroll is printed after employees payments printouts
		System.out.println("**************************************************************");
		System.out.printf("The total amount to be paid to all employees is: $%,.2f%n", payroll);
	}
	
	/*
	* Method that prints employees name and payment amount
	*/
	private void printStatement(String name, double payment)
	{
		System.out.printf("Employee [ %s ] is owed [ $%,.2f ]%n", name, payment);
	}
}//end class