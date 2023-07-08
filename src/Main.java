import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int point = 0;
        int diceOne = random.nextInt(6) + 1;
        int diceTwo = random.nextInt(6) + 1;
        int crapsRoll = diceOne + diceTwo;
        String play = "";
        boolean playAgain = false;
        boolean win = false;

        do
        {
            diceOne = random.nextInt(6) + 1;
            diceTwo = random.nextInt(6) + 1;
            crapsRoll = diceOne + diceTwo;
            System.out.println("To roll the dice press Enter");
            in.nextLine();
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12 )
            {
                System.out.println("Dice one was:" + diceOne + " and dice two was:" + diceTwo);
                System.out.println("The Dice rolled: " + crapsRoll + " you crapped out and lose!");
                System.out.println("Would you like to play again? Y or N");
                play = in.nextLine();
                win = false;
                if (play.equalsIgnoreCase("Y"))
                {
                    playAgain = true;
                }
                else
                {
                    playAgain = false;
                }

            } else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Dice one was:" + diceOne + " and dice two was:" + diceTwo);
                System.out.println("The dice rolled:" + crapsRoll + " you win with a natural!");
                System.out.println("Would you like to play again? Y or N");
                play = in.nextLine();
                win = false;
                if (play.equalsIgnoreCase("Y"))
                {
                    playAgain = true;
                }
                else
                {
                    playAgain = false;
                }
            }
            else
            {
             point = crapsRoll;
                System.out.println("Dice one was: " + diceOne + " and Dice two was: " + diceTwo);
                System.out.println("The point is: " + crapsRoll);
                win = true;
                do
                {
                    diceOne = random.nextInt(6) + 1;
                    diceTwo = random.nextInt(6) + 1;
                    crapsRoll = diceOne + diceTwo;
                    System.out.println("Press Enter to roll again");
                    in.nextLine();
                    if (crapsRoll == point)
                    {
                        System.out.println("Dice one was: " + diceOne + " and Dice two was: " + diceTwo);
                        System.out.println("You made point and won!");
                        System.out.println("Would you like to play again? Y or N");
                        play = in.nextLine();
                        win = false;
                        if (play.equalsIgnoreCase("Y"))
                        {
                            playAgain = true;
                        }
                        else
                        {
                            playAgain = false;
                        }
                    } else if (crapsRoll == 7)
                    {
                        System.out.println("Dice one was:" + diceOne + " and Dice two was:" + diceTwo);
                        System.out.println("The Dice rolled:" + crapsRoll + " you got 7 and are out NEXT SHOOTER PLEASE!");
                        System.out.println("Would you like to play again? Y or N");
                        play = in.nextLine();
                        win = false;
                        if (play.equalsIgnoreCase("Y"))
                        {
                            playAgain = true;
                        }
                        else
                        {
                            playAgain = false;
                        }
                    }
                    else
                    {
                        System.out.println("Dice one was:" + diceOne + " and Dice two was:" + diceTwo);
                        System.out.println("The Dice rolled:" + crapsRoll + " trying for point");
                    }
                }
                while(win);
            }
        }
        while(playAgain);
    }
}