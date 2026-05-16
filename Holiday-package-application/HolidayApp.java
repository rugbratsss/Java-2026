import java.util.Scanner;

public class HolidayApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is this an international holiday? (true/false): ");
        boolean international = input.nextBoolean();
        input.nextLine();

        System.out.print("Enter accommodation type (Hotel/Resort/Guest House): ");
        String accommodationType = input.nextLine();

        System.out.print("Enter number of days: ");
        int days = input.nextInt();

        System.out.print("Enter base package price: ");
        double packagePrice = input.nextDouble();

        HolidayPackage hp = new HolidayPackage(international, accommodationType, days, packagePrice);

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n=== Holiday Package Menu ===");
            System.out.println("1. Display package details");
            System.out.println("2. Update accommodation type");
            System.out.println("3. Update number of days");
            System.out.println("4. Calculate total package cost");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Package Profile ---");
                    System.out.println("International   : " + hp.getInternational());
                    System.out.println("Accommodation   : " + hp.getAccommodationType());
                    System.out.println("Duration (Days) : " + hp.getDays());
                    System.out.printf("Base Price      : R%.2f\n", hp.getPackagePrice());
                    break;

                case 2:
                    System.out.print("Enter new accommodation type: ");
                    String newType = input.nextLine();
                    hp.setAccommodationType(newType);
                    break;

                case 3:
                    System.out.print("Enter new number of days: ");
                    int newDays = input.nextInt();
                    hp.setDays(newDays);
                    break;

                case 4:
                    System.out.printf("\nTotal Calculated Cost: R%.2f\n", hp.calculateCost());
                    break;

                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
        input.close();
    }
}
