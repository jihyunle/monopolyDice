import java.util.Random;
import java.util.Scanner;

public class monopolyDice {
    public static void main(String[] args){
        int diceA = 0;
        int diceB = 0;
        int doubleRollCount = 0;
        String quitNow = " ";

        Random rnd = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to quit the game at this time?: Y or N");
        quitNow = keyboard.nextLine();

        // roll two dices and show results
        while(quitNow.toLowerCase() != "y"){
            diceA = 1 + (rnd.nextInt(6));
            diceB = 1 + (rnd.nextInt(6));
            System.out.println("User rolls " + diceA + " & " + diceB);

            if(diceA == diceB){
                System.out.println("DOUBLES!");
                doubleRollCount++;

                if(doubleRollCount < 3){
                    continue;
                }else
                    System.out.println("GO TO JAIL ---> bye");

            }else
                System.out.println("Move " + (diceA + diceB) + " spaces and stop");
                break;
        }
        System.out.println("Would you like to quit the game at this time?: Y or N");
        quitNow = keyboard.nextLine();





    }
}
