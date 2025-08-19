package Task.Task_20thJune;

import java.util.Scanner;

public class Task20thJune_Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic pay
        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        // Validate basic pay
        if (basicPay <= 0) {
            System.out.println("Invalid Basic Pay. It must be a positive number.");
        } else {
            // Calculations
            double hra = basicPay * 0.20;          // HRA = 20%
            double da = basicPay * 0.10;           // DA = 10%
            double grossSalary = basicPay + hra + da;
            double tax = grossSalary * 0.12;       // Tax = 12%
            double netSalary = grossSalary - tax;

            // Output breakdown
            System.out.printf("Basic Pay: Rs. %.2f%n", basicPay);
            System.out.printf("HRA (20%%): Rs. %.2f%n", hra);
            System.out.printf("DA (10%%): Rs. %.2f%n", da);
            System.out.printf("Gross Salary: Rs. %.2f%n", grossSalary);
            System.out.printf("Tax Deduction (12%%): Rs. %.2f%n", tax);
            System.out.printf("Net Salary: Rs. %.2f%n", netSalary);
        }

        scanner.close();
    }
}
