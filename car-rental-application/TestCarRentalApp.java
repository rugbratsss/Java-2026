import java.util.Scanner;
public class TestCarRentalApp{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the group: ");
		String carGroup = kb.nextLine();
		
		System.out.print("Enter the rate per day: ");
		double ratePerDay = kb.nextDouble();
		
		System.out.print("Enter duration for the rental: ");
		int rentalDays = kb.nextInt();
		
		CarRentalApp c1 = new CarRentalApp(carGroup,ratePerDay,rentalDays);
		
		System.out.println("Car model: " + c1.getCarGroup());
		System.out.println("Rate Per Day: " + c1.getRatePerDay());
		System.out.println("Number Of Days Rented: " + c1.getRentalDays());
		System.out.printf("Total Rental Cost: R%.2f", c1.calculateRentalCost());
	}
}
