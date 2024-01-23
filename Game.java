// package ICE;
import java.util.Scanner;
import java.util.Random;
public class Game 
{
    // Scanner - used for getting user input
    // Private means it's only usable within this class (Game)
    static private Scanner scanner = new Scanner(System.in);

    // RNG
    static private Random random = new Random();

    /**End the game by closing the scanner **/
    static public void endGame()
    {
        scanner.close();
    }
    

    /** Asks if the player wants to play again
     * @return true in case they choose yes, otherwise, return false
     **/
    static public boolean playAgain()
    {
        System.out.print("Play again? Choose (y/n): ");

        // return true in case yes, otherwise return false
        return scanner.nextLine().equals("y");
    }

    /**
     * Ask the player to choose either rock, paper, or scissors
     * mkaing sure the player picks a valid option
     * @return The player's choice
     */
    static public String getPlayersChoice()
    {
        // Variables
        String player;
        boolean validOption;

        do
        {
            System.out.print("Choose Rock, Paper, or Scissors: ");

            // Converted to lowercase
            player = scanner.nextLine().toLowerCase();

            // Check if the player picked a valid option
            // True if valid, False if not
            validOption = player.equals("rock") ||
                          player.equals("paper")||
                          player.equals("scissors");
            
            // Error in case option is not valid
            if(!validOption) System.out.println("Error - Invalid Option!");
        
        // Repeat while option is invalid
        }while(!validOption);

        // Valid option
        return player;    
    }

    /**
     * Gets CPU choice
     * @return The CPU's choice
     */
    static public String getCpuChoice()
    {
        // get a random number from 0 to 3
        int randomNumber = random.nextInt(0,3);
        
        switch(randomNumber)
        {
            case 0: return "rock"; 
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    /**
     * @param player The player's choice
     * @param cpu The computer's choice
     * @return The winner
     **/
    static String getResult(String player, String cpu)
    {
        String result = "";
        // Draw condition
        if(player.equals(cpu)) result = "Draw";

        // Player winning condition
        else if(
            player.equals("scissors") && cpu.equals("paper") ||
            player.equals("paper") && cpu.equals("rock") ||
            player.equals("rock") && cpu.equals("scissors")            
        ) result = "Player Wins";

        // CPU winning condition
        else result = "CPU Wins";

        // Return the winner
        return result;
    }
}

