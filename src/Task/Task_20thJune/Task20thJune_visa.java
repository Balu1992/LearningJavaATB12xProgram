package Task.Task_20thJune;

import java.util.Scanner;

public class Task20thJune_visa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Age
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Input Visa Status
        System.out.print("Enter Visa Status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();

        // Validate Age
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status. Please enter 'valid' or 'invalid'.");
        } else {
            // Check Eligibility
            if (age >= 18 && visaStatus.equals("valid")) {
                System.out.println("You are eligible to travel.");
            } else {
                System.out.println(" You are not eligible to travel.");
            }
        }

        scanner.close();
    }
}


