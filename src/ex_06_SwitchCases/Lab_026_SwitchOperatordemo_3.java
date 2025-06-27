package ex_06_SwitchCases;

import java.util.Locale;
import java.util.Scanner;

public class Lab_026_SwitchOperatordemo_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the browser:");
        String browser=sc.next();
        browser=browser.toLowerCase(Locale.ROOT); //converting to lowercase even though user entered UPPER/CAPS string
        switch(browser){
            case "chrome":
                System.out.println("Chrome broswer");
                break;
            case "edge":
                System.out.println("Edge broswer");
                break;
        }
    }
}
