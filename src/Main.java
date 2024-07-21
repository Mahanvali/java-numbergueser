package numberguesser.src;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean hasntGuessed = true;
        Scanner scannerObj = new Scanner(System.in);    //  Create new Scanner object
        Random rand = new Random(); //  Create new Random
        int randomNumber = rand.nextInt(100 - 1 + 1) + 1;    //  Only select random numbers from 1 to 100
        while (hasntGuessed) {  //  While the user hasn't guessed the right number
            System.out.print("Guess a number between 0 - 100: ");
            int guessedNumber = scannerObj.nextInt();   //  Take in user input
            if(guessedNumber > randomNumber){   //  If the user has input a high number
                System.out.println("Pick a lower number!");
            } else if(guessedNumber < randomNumber){    //  If the user has input a low number
                System.out.println("Pick a higher number!");
            } else if(guessedNumber == randomNumber){   //  If the user has input the right number
                hasntGuessed = false;
                System.out.println("You did it! the random number was: " + randomNumber);
            }
        }
        scannerObj.close(); //  Close the Scanner object
    }
}
