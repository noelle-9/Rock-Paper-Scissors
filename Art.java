public class Art {

    static final String ROCK = """
            _______
        ---'   ____)  
              (_____)  
              (_____)  
              (____)
        ---.__(___) 
            """;
    
    static final String PAPER = """
            _______
        ---'   ____)____  
                  ______)  
                  _______)  
                 _______)
        ---.__________) 
            """;
    static final String SCISSOR = """
    _______
---'   ____)____  
          ______)  
       __________)  
      (____)
---.__(___)  
            """;

    static final String PLAYER_WINS = "\033[32m" +
        "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
        "~*~        PLAYER WINS        ~*~\n" +
        "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
        "\033[0m";

    static final String CPU_WINS = "\033[31m" +
       "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
       "~*~         CPU  WINS         ~*~\n" +
       "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" + 
       "\033[0m";

    static final String DRAW = "\033[33m" +
        "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
        "~*~          D R A W          ~*~\n" +
        "~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~\n" +
        "\033[0m";

}