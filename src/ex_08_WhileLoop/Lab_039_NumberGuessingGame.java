package ex_08_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab_039_NumberGuessingGame {
    public static void main(String[] args) {
        // Number guessing game
        //We'll use RANDOM class for generating random numbers.
        Random random=new Random();
        int numtoguess=random.nextInt(100)+1; //+1 is used as bound will only give value till 99
        //System.out.println(numtoguess);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int guess;
        int attempts=0;

        while(true){
            guess=sc.nextInt(); //Take input from user
            attempts++;
            if(guess<numtoguess){
                System.out.println("Too low");
            } else if (guess > numtoguess) {
                System.out.println("Too High");
            } else {
                System.out.println("Exact match and you finished in\t" +attempts+ "attempts");
                break;
            }
        }
    }
}
