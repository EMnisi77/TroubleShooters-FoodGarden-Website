import java.util.Scanner;
import java.text.DecimalFormat;

public class HealthSalaryCalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat ("R #,##0.00");
		//DecimalFormat formatter = new DecimalFormat("0.00"); The one above is incorrect
		
		int hoursWorked;
		double salary;
		double hourlyRate;
		double regularPay = 0;
		double overtime = 0;
		double overtimeAbove50 = 0;
		final double TAX_RATE = 0.20;
		
		System.out.println("Enter number of hours Worked: ");
		hoursWorked = keyboard.nextInt();
		
		if (hoursWorked <= 0)
		{
			System.out.println("---------------------------------------------");
			System.out.println("You have not worked enough hours to make a valid salary calculation.");
			System.out.println("---------------------------------------------");
			System.out.println("Thank you , Goodbye.");
		}
		else
		{
			System.out.println("Enter hourly rate: ");
			hourlyRate = keyboard.nextDouble();
			
		if (hoursWorked <= 40)
		{
			// Misspelled the hoursWorked variable as hours.
			regularPay = hours * hourlyRate;
		}
		
		// This else below shouldn't exist. 
		else 
		{
			regularPay = 40 * hourlyRate;
		}
		
		// This should be an else-if not if
		if (hoursWorked > 40 && hoursWorked <= 50)
		{
			overtime = (hoursWorked - 40 ) * hourlyRate * 1.5;
			// regularPay should also be included here
		}
		
		else if(hoursWorked > 50)
		{
			// regularPay should also be included here
			overtime = 10 * hourlyRate 1.5;
			// overtimeAbove50 should be included here
		}
		
		// This if statement shouldn't exist.
		if (hoursWorked > 50)
		{
			overtimeAbove50 = ( hoursWorked -50 ) * hourlyRate * 2;
		}
		
		double gross = regularPay + overtime + overtimeAbove50;
		double tax = gross * TAX_RATE;
		double net = gross - tax;
		
		System.out.println("------------------------------------");
		System.out.println("Salary Report");
		System.out.println("------------------------------------");
		System.out.println("Regular pay:              " + df.format(regularPay));
		System.out.println("Overtime(to 50hrs):       " + df.format(overtime));
		System.out.println("Overtime(atter 50hrs):    " + df.format(overtimeAbove50));
		System.out.println("Gross pay:                " + df.format(gross));
		System.out.println("Tax amount:               " + df.format(tax));
		System.out.println("Net pay:                  " + df.format(net));
		System.out.println("-----------------------------------");
		System.out.println("Thank You, Goodbye");
		
			
		
		}
	}
}