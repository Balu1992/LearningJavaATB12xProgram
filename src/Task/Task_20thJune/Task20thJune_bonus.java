package Task.Task_20thJune;

import java.util.Scanner;

public class Task20thJune_bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Input years of experience
        System.out.print("Enter your years of experience: ");
        double experience = scanner.nextDouble();

        // Validate input
        if (salary <= 0) {
            System.out.println("Invalid salary. Must be a positive number.");
        } else if (experience < 0) {
            System.out.println("Invalid experience. Cannot be negative.");
        } else {
            double bonus = calculateBonus(salary, experience);
            System.out.printf("Your bonus is: Rs. %.2f%n", bonus);
        }

        scanner.close();
    }

    // Method to calculate bonus
    public static double calculateBonus(double salary, double years) {
        if (years < 1) {
            return 0.0;
        } else if (years >= 1 && years <= 3) {
            return salary * 0.05;
        } else if (years >= 4 && years <= 6) {
            return salary * 0.10;
        } else { // years > 6
            return salary * 0.15;
        }
    }
}
