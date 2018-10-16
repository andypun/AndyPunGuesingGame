package AndyPun;

import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Hey how are you! What is your name?");
        String player = name.nextLine();
        System.out.println("Hi, " + player + "" + "!  Type guess to guess or type AI to make the AI guess");
        String game = name.nextLine();
        if (game.equals("guess"))
        {
            System.out.println("Alright! Guess a number between 1 and 15!");
            int randomNum = (int) (Math.random() * 15);
            int playerGuess = name.nextInt();
            boolean bool = false;
            while (!bool)
            {
                if (playerGuess == randomNum)
                {
                    System.out.println("Excellent " + player + "! You guessed correctly!");
                    bool = true;
                }
                else if (playerGuess > 15 || playerGuess < 1)
                {
                    System.out.println("The number you guessed doesn't belong in the range! Try again!");
                    playerGuess = name.nextInt();
                }
                else
                    {
                    System.out.println("Incorrect! Try again!");
                    playerGuess = name.nextInt();
                    }
            }
        }
        else if (game.equals("AI"))
        {
            System.out.println(player + ", think of a number from 1 to 100 and I'll guess it!");
            int random = 50;
            int mid = random/2;
            boolean bool = false;
            while (!bool)
            {
                System.out.println("Is it greater than, less than, or equal to " + random + "?");
                String userInput = name.nextLine();
                if (userInput.equals("greater"))
                {
                    random = random + mid;
                    mid = mid / 2;
                }
                if (userInput.equals("less"))
                {
                    random = random - mid;
                    mid = mid / 2;
                }
                if (userInput.equals("equal"))
                {
                    System.out.println(player + ", the number is " + random + "!");
                    bool = true;
                }
            }
        }
    }
}