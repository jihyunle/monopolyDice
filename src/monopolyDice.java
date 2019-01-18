import java.util.Random;
import java.util.Scanner;

public class monopolyDice {
    public static void main(String[] args){

        int diceA = 0;
        int diceB = 0;
        int doubleRollCount = 0;
        String playAgain = "y";

        Random rnd = new Random();
        Scanner keyboard = new Scanner(System.in);

        // roll two dices and show results
        do {
            diceA = 1 + (rnd.nextInt(6));
            diceB = 1 + (rnd.nextInt(6));
            System.out.println("User rolls " + diceA + " & " + diceB);

            if(diceA == diceB){
                System.out.println("DOUBLES!");
                doubleRollCount++;

                if(doubleRollCount < 3){
                    System.out.println("Move " + (diceA + diceB) + " spaces and roll again getting...");
                    //continue;
                }else{
                    System.out.println("GO TO JAIL --->");
                    break;
                }

            }else{
                System.out.println("Move " + (diceA + diceB) + " spaces and stop");
            }


            playAgain = " ";
            System.out.println("Would you like to roll the dice again?: Y or N");
            playAgain = keyboard.nextLine();
        }
        while(playAgain.equalsIgnoreCase("y"));

        // if user does not want to play again
        // display exit message
        System.out.println("You are now leaving the game. Goodbye!");
        keyboard.close();
        System.exit(0);

    }
}
