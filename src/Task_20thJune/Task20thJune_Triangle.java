package Task_20thJune;

import java.util.Scanner;

public class Task20thJune_Triangle {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Input three sides
                System.out.print("Enter side a: ");
                int a = scanner.nextInt();

                System.out.print("Enter side b: ");
                int b = scanner.nextInt();

                System.out.print("Enter side c: ");
                int c = scanner.nextInt();

                // Check triangle validity
                if (isValidTriangle(a, b, c)) {
                    System.out.println("The triangle is valid.");
                } else {
                    System.out.println("The triangle is NOT valid.");
                }

                scanner.close();
            }

            // Method to check triangle validity
            public static boolean isValidTriangle(int a, int b, int c) {
                return (a + b > c) && (a + c > b) && (b + c > a);
            }
        }


