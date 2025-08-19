package Task.Task23rdJune;

import java.util.Scanner;

public class Task23rdJune_typeofwebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the address:");
        String s = sc.nextLine();
        if (s.contains(".com")) {
            System.out.println("Commercial website");
        } else if (s.contains(".org")) {
            System.out.println("Non Profit organization");
        } else if (s.contains(".edu")) {
            System.out.println("Educational Organization");
        } else if (s.contains(".gov")) {
            System.out.println("Government Website");
        } else if (s.contains(".net")) {
            System.out.println("Network related website");
        } else if (s.contains(".info")) {
            System.out.println("Informational Website");
        }else {
            System.out.println("Other website");
        }

    }
}
