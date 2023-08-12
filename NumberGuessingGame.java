package projectprectice;

import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
	
	public static void NumberGame(){
        Scanner sc = new Scanner(System.in);
        int RandomNum = 1 + (int)(100* Math.random());

        int K = 5; //Number of trails
        int i, GuessNum;
 
        System.out.println("A number is chosen between 1 to 100.\nGuess the number within 5 trials.");

        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            GuessNum = sc.nextInt();
 
            // If the number is guessed
            if (RandomNum == GuessNum) {
                System.out.println("Congratulations! You guessed the number.(Attempet: " + (i+1) + ")" );
                break;
            }
            else if (RandomNum > GuessNum && (i != K - 1) ) 
            {
                System.out.println("The number is greater than " + GuessNum);
            }
            else if (RandomNum < GuessNum && (i != K - 1) ) 
            {
                System.out.println( "The number is less than " + GuessNum);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted " + K + " trials.");
            System.out.println("The number was " + RandomNum);
        }

    }
    public static void main(String arg[])
    {
        // Function Call
        NumberGame();
        while(true){
            System.out.println("Want to Play Again? (1/0): ");
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            if(val==1){
                NumberGame();
            }
            else{
                break;
            }
        }
    }
	
}