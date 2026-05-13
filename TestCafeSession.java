import java.util.Scanner;
public class TestCafeSession{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		double hourlyRate = 0 ;
		System.out.print("Enter customer name: ");
		String customerName = kb.nextLine();
		
		System.out.print("Enter plan code(B/S/P/V): ");
		char planCode = kb.next().charAt(0);
		
		System.out.print("Enter hours used: ");
		double hoursUsed = kb.nextDouble();
		switch(planCode){
			case 'B':
			case 'b': 
				hourlyRate = 10.00;
				break;
			case 'S':
			case 's':
				hourlyRate = 7.50;
				break;
			case 'P':
			case 'p':
				hourlyRate = 15.00;
				break;
			case 'V':
			case 'v':
				hourlyRate = 20.00;
			default:
				System.out.println("Invalid plan code");
				break;
				
		}
		CafeSession c1 = new CafeSession(customerName,planCode,hourlyRate,hoursUsed);
		
		System.out.println("Customer name: " + c1.getCustomerName()); 
		System.out.println("Plan code: " + c1.getPlanCode());
		System.out.println("Hourly rate: " + c1.getHourlyRate());
		System.out.println("Hours used: " + c1.getHoursUsed());
		System.out.printf("Total bill: R%.2f%n", c1.calculateBill());
		
	}
}
