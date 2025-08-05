package Task_20thJune;

import java.util.Scanner;

public class Task20thJune_Numberispalindromeornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;          // Get last digit
            reversed = reversed * 10 + digit;  // Append digit
            num /= 10;                     // Remove last digit
        }

        return original == reversed;
    }
}
