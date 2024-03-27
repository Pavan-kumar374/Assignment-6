import java.util.Scanner;

public class DiscountedExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        System.out.println("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        double totalExpenses = quantity * pricePerItem;
        double discount = 0.0;

        if (quantity > 50) {
            discount = 0.10 * totalExpenses;
        } else if (quantity >= 25) {
            discount = 0.05 * totalExpenses;
        }

        double finalPrice = totalExpenses - discount;

        System.out.println("Total expenses before discount: $" + totalExpenses);
        System.out.println("Discount: $" + discount);
        System.out.println("Final price: $" + finalPrice);

        scanner.close();
    }
}