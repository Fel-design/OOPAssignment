// Import the Scanner class to read input from the user
import java.util.Scanner;

public class EmployeeBonus {

    // The main method: This is the entry point of the program where execution starts
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Hard code the salary and years of service
        // Example salary: 50000
        double salary = 50000;

        // Example years of service: 7
        int yearsOfService = 7;

        // Initialize bonus percentage
        double bonusPercentage = 0.0;

        // Determine the bonus percentage based on years of service
        if (yearsOfService > 10) {
            bonusPercentage = 0.12; // 12% bonus for more than 10 years
        } else if (yearsOfService >= 6 && yearsOfService <= 10) {
            bonusPercentage = 0.10; // 10% bonus for 6 to 10 years
        } else if (yearsOfService < 6) {
            bonusPercentage = 0.08; // 8% bonus for less than 6 years
        }

        // Calculate the net bonus amount
        double bonusAmount = salary * bonusPercentage;

        // Print the net bonus amount to the console
        System.out.println("The net bonus amount is: $" + bonusAmount);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}