import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		
		double grossPay = 0;
		double taxAmount = 0;
		double netPay = 0;
		
		int hoursWorked;
		
		final int regularHours = 40;
		
		double regularPay = 0;
		
		double overtimePay1 = 0;
		double overtimePay2 = 0;
		
		double hourlyRate;
		
		final double taxRate = 0.2;
		
		System.out.print("Enter number of hours worked: ");
		hoursWorked = scanner.nextInt();
		
		if(hoursWorked < 1) {
			System.out.println("""
			------------------------------------------------------------------
			You have not worked enough hours to make a valid salary calculation.
			------------------------------------------------------------------
			Thank you, goodbye.
			""");
			return;
		}
		else {
			System.out.print("Enter Hourly Rate: ");
			hourlyRate = scanner.nextDouble();
		}
		
		if(hoursWorked <= regularHours) {
			regularPay = hourlyRate * hoursWorked;
		}
		else if(hoursWorked > regularHours && hoursWorked <= 50) {
			regularPay = hourlyRate * regularHours;
			overtimePay1 = (hourlyRate * 1.5) * (hoursWorked - regularHours);
		}
		else if(hoursWorked > regularHours && hoursWorked > 50) {
			regularPay = hourlyRate * regularHours;
			overtimePay1 = (hourlyRate * 1.5) * 10;
			overtimePay2 = (hourlyRate * 2) * (hoursWorked - 50);
		}
		
		grossPay = regularPay + overtimePay1 + overtimePay2;
		taxAmount = grossPay * taxRate;
		netPay = grossPay - taxAmount;
		
		System.out.println(
		"------------------------------------------------------------------" +
		"\nSalary Report\n" +
		"------------------------------------------------------------------\n" +
		"Regular Pay: \t\t R " + regularPay +
		"\nOvertime(to 50Hrs): \t R " + overtimePay1 +
		"\nOvertime(after 50Hrs): \t R " + overtimePay2 +
		"\nGross Pay: \t\t R " + grossPay +
		"\nTax Amount: \t\t R " + taxAmount + 
		"\nNet Pay: \t\t R " + netPay +
		"\n------------------------------------------------------------------" +
		"\nThank You, GoodBye\n" +
		"-----------------------------------------------------------------"
		);
	}
}