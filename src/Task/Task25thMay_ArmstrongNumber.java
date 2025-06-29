package Task;

import java.util.Scanner;

public class Task25thMay_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int digits = 0;
        int result = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Calculate sum of powers
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Check if Armstrong
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
