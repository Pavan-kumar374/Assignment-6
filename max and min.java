import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        boolean continueInput = true;
        
        while (continueInput) {
            System.out.print("Enter a number (enter any non-numeric value to stop): ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
                if (num < smallest) {
                    smallest = num;
                }
                if (num > largest) {
                    largest = num;
                }
            } else {
                continueInput = false;
            }
        }
        
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        }
        
        scanner.close();
    }
}


