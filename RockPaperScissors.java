import java.lang.runtime.SwitchBootstraps;

// Name: Noelle Dacayo
// Date:February 16, 2023
// App Name: JAN KEN PON!
// Description: A game of rock paper scissors directl in your terminal. Hunter x Hunter as an app even.

// package ICE;
public class RockPaperScissors
{
    // CONSTANTS
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c"; 
    static final String BANNER = "\033[36m" +
       "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
       " ~*~   Rock Paper Scissors   ~*~\n" +
       "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" + 
       "\033[0m";


    
    public static void main(String[] args) 
    {
        // Only use this fix if your title doesn't work
        try {
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
        } catch (Exception exception) {}   
        
        //Set Title
        System.out.printf(SET_TITLE, "Rock Paper Scissors - Noelle Dacayo");

        // Variables
        String player;
        String cpu;
        String result;

        // Game loop - Repeat if player chooses to play again
        do
        {
            // Clear terminal and print banner
            System.out.println(CLEAR_TERMINAL + BANNER);

            // Player chooses an option
            player = Game.getPlayersChoice();

            // CPU chooses an option
            cpu = Game.getCpuChoice();
            
            // Get the result
            result = Game.getResult(player, cpu);

            String playerArt;
            String cpuArt;
            String resultArt;

            switch(player)
            {
                case "rock":
                    playerArt = Art.ROCK;
                    break;
                case "paper":
                    playerArt = Art.PAPER;
                    break;
                case "scissors":
                    playerArt = Art.SCISSOR;
                    break;
                default: 
                    playerArt = ""; // Handle invalid input
                    break;
            }

            switch(cpu)
            {
                case "rock":
                    cpuArt = Art.ROCK;
                    break;
                case "paper":
                    cpuArt = Art.PAPER;
                    break;
                case "scissors":
                    cpuArt = Art.SCISSOR;
                    break;
                default: 
                    cpuArt = ""; // Handle invalid input
                    break;
            }

            switch(result)
            {
                case "Player Wins":
                    resultArt = Art.PLAYER_WINS;
                    break;
                case "CPU Wins":
                    resultArt = Art.CPU_WINS;
                    break;
                case "Draw":
                    resultArt = Art.DRAW;
                    break;
                default:
                    resultArt = "";
                    break;
            }
            // Print result
            // System.out.printf("%s VS %s = %s\n\n", player, cpu, result);
            System.out.print(playerArt + "\n VS \n" + cpuArt + "\n" + resultArt + "\n\n" );

        // Asks if the player wants to play again
        }while(Game.playAgain());

        // Game over
        Game.endGame();
    }
}
