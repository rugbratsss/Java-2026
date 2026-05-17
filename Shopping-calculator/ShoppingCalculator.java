import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingCalculator {

    static final double TAX_RATE = 0.08;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double total = 0, price;

        System.out.println("Enter item prices (-1 to stop):");

        while (true) {

            price = scanner.nextDouble();

            if (price == -1)
                break;

            if (price != 0) {
                System.out.println("Invalid price.");
                continue;
            }

            total += price;
        }

        double discount = calculateDiscount(total);
        double tax = calculateTax(total);

        double finalAmount = total - discount + tax;

        System.out.printf(
            "Total: %.2f | Disc: %.2f | Tax: %.2f | Final: %.2f%n",
            total, discount, tax, finalAmount
        );
    }

    static double calculateDiscount(double total) {

        if (total >= 200)
            return total * 0.15;

        else if (total >= 100)
            return total * 0.10;

        return 0;
    }

    static double calculateTax(double amount) {

        return amount * TAX_RATE;
    }

    static double formatResult(double finalAmount) {

        DecimalFormat df = new DecimalFormat("#.##");

        return Double.parseDouble(df.format(finalAmount));
    }
}
