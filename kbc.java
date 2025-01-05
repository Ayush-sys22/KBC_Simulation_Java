package sample;
import java.sql.*;
import java.util.Random;
import java.util.*;
public class GameSettings {
    private int timeLimit; // in seconds
    private int numberOfLifelines;

    public GameSettings() {
        // Default settings
        this.timeLimit = 30; // Default time limit of 30 seconds
        this.numberOfLifelines = 3; // Default number of lifelines
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getNumberOfLifelines() {
        return numberOfLifelines;
    }

    public void setNumberOfLifelines(int numberOfLifelines) {
        this.numberOfLifelines = numberOfLifelines;
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "timeLimit=" + timeLimit +
                ", numberOfLifelines=" + numberOfLifelines +
                '}';
    }
}


public class GameSettingsMenu {
    private GameSettings gameSettings;
    private Scanner scanner;

    public GameSettingsMenu() {
        this.gameSettings = new GameSettings();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("=== Game Settings Menu ===");
            System.out.println("1. Set Time Limit (seconds)");
            System.out.println("2. Set Number of Lifelines");
            System.out.println("3. View Current Settings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                setTimeLimit();
            } else if (choice == 2) {
                setNumberOfLifelines();
            } else if (choice == 3) {
                viewCurrentSettings();
            } else if (choice == 0) {
 System.out.println("Exiting settings menu.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void setTimeLimit() {
        System.out.print("Enter new time limit (in seconds): ");
        int newTimeLimit = scanner.nextInt();
        gameSettings.setTimeLimit(newTimeLimit);
        System.out.println("Time limit set to " + newTimeLimit + " seconds.");
    }

    private void setNumberOfLifelines() {
        System.out.print("Enter new number of lifelines: ");
        int newLifelines = scanner.nextInt();
        gameSettings.setNumberOfLifelines(newLifelines);
        System.out.println("Number of lifelines set to " + newLifelines + ".");
    }

    private void viewCurrentSettings() {
        System.out.println("Current Game Settings: " + gameSettings);
    }
}



public class kbc{
    int ap = 0, ph = 0, ff = 0, fq = 0, pp = 0, ask = 0, dd = 0;
    private static void printFiftyFiftyOptions(String[] options, String correctAnswer) {
        Random rand = new Random();
        int correctIndex = correctAnswer.charAt(0) - 'A'; // Convert correct answer to index
        int otherOptionIndex;

        // Randomly select an incorrect option to display along with the correct option
        do {
            otherOptionIndex = rand.nextInt(4);
        } while (otherOptionIndex == correctIndex);

        // Print the correct option and one random incorrect option
        int ans = rand.nextInt(2);
        if(ans==1) {
        	System.out.println(options[correctIndex] + "            " + options[otherOptionIndex]);
        }
        else {
        	System.out.println(options[otherOptionIndex] + "            " + options[correctIndex]);
        }
        
    }
    private static void audiencePoll(String[]options,String correctAnswer) {
    	Random rand = new Random();
        int correctIndex = correctAnswer.charAt(0) - 'A'; // Convert correct answer to index
        int otherOptionIndex;

        // Randomly select an incorrect option to display along with the correct option
        do {
            otherOptionIndex = rand.nextInt(4);
        } while (otherOptionIndex == correctIndex);
        int select = rand.nextInt(3);
        if(select==1 ) {
        	System.out.println("Audience Poll: Majority votes for option (" + options[correctIndex]+ ").");
           
        }
        else if(select == 2) {
        	System.out.println("Audience Poll: Majority votes for option (" +options[otherOptionIndex] + ").");
        }
        else {
        	System.out.println("Audience Poll: Majority votes for option (" + options[correctIndex]+ ").");
        }
        
    }
    private static void previous(String[]options,String correctAnswer) {
    	Random rand = new Random();
        int correctIndex = correctAnswer.charAt(0) - 'A'; // Convert correct answer to index
        int otherOptionIndex;

        // Randomly select an incorrect option to display along with the correct option
        do {
            otherOptionIndex = rand.nextInt(4);
        } while (otherOptionIndex == correctIndex);
        int select = rand.nextInt(3);
        if(select==1 ) {
        	System.out.println("Previous ans was : (" + options[correctIndex]+ ").");
           
        }
        else if(select == 2) {
        	System.out.println("Previous ans was : (" +options[correctIndex] + ").");
        }
        else {
        	System.out.println("Previous ans was : (" + options[correctIndex]+ ").");
        }
        
    }
    private static void expert(String[]options,String correctAnswer) {
    	Random rand = new Random();
        int correctIndex = correctAnswer.charAt(0) - 'A'; // Convert correct answer to index
        int otherOptionIndex;

        // Randomly select an incorrect option to display along with the correct option
        do {
            otherOptionIndex = rand.nextInt(4);
        } while (otherOptionIndex == correctIndex);
        int select = rand.nextInt(3);
        if(select==1 ) {
        	System.out.println("Ask the Expert: The expert says the answer is option (" + options[otherOptionIndex]+ ").");
           
        }
        else if(select == 2) {
        	System.out.println("Ask the Expert: The expert says the answer is option (" +options[otherOptionIndex] + ").");
        }
        else {
        	System.out.println("Ask the Expert: The expert says the answer is option (" + options[correctIndex]+ ").");
        }
        
    }
    private static String generate(String category, Scanner scanner) {
        String question = "";
        String[] options = new String[4];
        String correctAnswer = "";

        switch (category) {
            case "History":
                question = "Who was the first President of the United States?";
                options = new String[]{"(A) George Washington", "(B) Abraham Lincoln", "(C) Thomas Jefferson", "(D) John Adams"};
                correctAnswer = "A";
                break;

            case "Science":
                question = "What is the chemical symbol for water?";
                options = new String[]{"(A) O2", "(B) H2O", "(C) CO2", "(D) NaCl"};
                correctAnswer = "B";
                break;

            case "Geography":
                question = "Which is the largest continent by area?";
                options = new String[]{"(A) Africa", "(B) Europe", "(C) Asia", "(D) South America"};
                correctAnswer = "C";
                break;

            case "Sports":
                question = "Which country won the FIFA World Cup in 2018?";
                options = new String[]{"(A) Brazil", "(B) Germany", "(C) France", "(D) Argentina"};
                correctAnswer = "C";
                break;

            case "Entertainment":
                question = "Who directed the movie 'Inception'?";
                options = new String[]{"(A) Christopher Nolan", "(B) Steven Spielberg", "(C) James Cameron", "(D) Quentin Tarantino"};
                correctAnswer = "A";
                break;

            case "Technology":
                question = "What does CPU stand for?";
                options = new String[]{"(A) Central Processing Unit", "(B) Computer Personal Unit", "(C) Central Programming Unit", "(D) Control Processing Unit"};
                correctAnswer = "A";
                break;

            case "Mythology":
                question = "In Greek mythology, who is the king of the gods?";
                options = new String[]{"(A) Poseidon", "(B) Zeus", "(C) Apollo", "(D) Hades"};
                correctAnswer = "B";
                break;

            case "Literature":
                question = "Who wrote 'Pride and Prejudice'?";
                options = new String[]{"(A) Charlotte Bronte", "(B) Jane Austen", "(C) Charles Dickens", "(D) Mark Twain"};
                correctAnswer = "B";
                break;

            default:
                System.out.println("No question available for this category.");
                return "";
        }

        // Display the question and options
        System.out.println("New Question: " + question);
        System.out.println("Options: ");
        for (String option : options) {
            System.out.println(option);
        }

        // Return the correct answer to be used for validation
        return correctAnswer;
    }
    private static boolean validateNewAnswer(String userAnswer, String correctAnswer) {
        // Check if the user's answer matches the correct answer (case insensitive)
        if (userAnswer == null || correctAnswer == null) {
            System.out.println("Invalid input. Please provide a valid answer.");
            return false;
        }

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            System.out.println("Incorrect. The correct answer was: " + correctAnswer);
            return false;
        }
    }




    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
    	String sname;
        int age;
        int lifelineUsed = 0;
        long rupess = 0;
        boolean[] lifelineAvailable = {true, true, true, true};
 
    
       try{
       kbc x=new kbc(); 
       Scanner m=new Scanner(System.in);

 
       Long Logo;
       Logo = System.currentTimeMillis();
       if(Logo%3==0){
    
      
     System.out.println("\t\t              ________________________________________________________________________________________________");
     System.out.println("\t\t            /|                                                                                                |");
     System.out.println("\t\t           / |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
     System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
     System.out.println("\t\t          |  |  ''       __       _ ___         _____________________           ___________________     ''    |");
     System.out.println("\t\t          |  |  ''     /|  |     / /  /       /|   _______________   |        /|   ________________|    ''    |");
     System.out.println("\t\t          |  |  ''    | |  |    / /  /       | |  |_____________ /|  |       | |  |_______________/     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |   / /  /        | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |  / /  /         | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  | / /  /          | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |/ /  /           | |  |_____________|_|  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  | /  /            | |   _______________   |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |/\\  \\            | |  |______________/|  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |\\ \\  \\           | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  | \\ \\  \\          | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |  \\ \\  \\         | |  |             | |  |       | |  |                     ''    |");
     System.out.println("\t\t          |  |  ''    | |  |   \\ \\  \\        | |  |_____________|_|  |       | |  |________________     ''    |");
     System.out.println("\t\t          |  |  ''    | |__|    \\ \\__\\       | |_____________________|       | |___________________|    ''    |");
     System.out.println("\t\t          |  |  ''    |/__ /     \\/__/       |/_____________________/        |/___________________/     ''    |");
     System.out.println("\t\t          |  |  ''                                                                                      ''    |");
     System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
     System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
     System.out.println("\t\t          |  |________________________________________________________________________________________________|");
     System.out.println("\t\t          | /                                                                                                /");
     System.out.println("\t\t          |/________________________________________________________________________________________________/");
    
       }

       else if(Logo%3==2){
       System.out.println("\t\t     [@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@] ");
       System.out.println("\t\t     [@]                                                                  [@] ");
	System.out.println("\t\t     [@]  K K      K K    BBBBBBBBBBBBBBBBBBBBB     CCCCCCCCCCCCCCCCCCCC  [@] ");
       System.out.println("\t\t     [@]  K K     K K     B BBBBBBBBBBBBBBBBB B     C CCCCCCCCCCCCCCCCCC  [@] ");
       System.out.println("\t\t     [@]  K K    K K      B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K   K K       B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K  K K        B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K K K         B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K KK K          B BBBBBBBBBBBBBBBBB B     C C                   [@] ");
       System.out.println("\t\t     [@]  K   K           B BBBBBBBBBBBBBBBBB B     C C                   [@] ");
       System.out.println("\t\t     [@]  K KK K          B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K K K         B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K  K K        B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K   K K       B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K    K K      B B               B B     C C                   [@] ");
       System.out.println("\t\t     [@]  K K     K K     B BBBBBBBBBBBBBBBBB B     C CCCCCCCCCCCCCCCCCC  [@] ");
       System.out.println("\t\t     [@]  K K      K K    BBBBBBBBBBBBBBBBBBBBB     CCCCCCCCCCCCCCCCCCCC  [@] ");
       System.out.println("\t\t     [@]                                                                  [@] ");
       System.out.println("\t\t     [@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@][@] ");

    
       
       
       
           
       }
               else if(Logo%3==1){
System.out.println("\t\t                                                                          ");
System.out.println("\t\t           •••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••    ");
System.out.println("\t\t         •••                                                                   •••   ");
System.out.println("\t\t        ••••    ¶ ¶      ¶ ¶      ¶¶¶¶¶¶¶¶¶¶¶¶¶¶       ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶     ••••    ");
System.out.println("\t\t       •••••    ¶ ¶     ¶ ¶       ¶ ¶¶¶¶¶¶¶¶¶¶¶ ¶      ¶ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶     •••••   ");
System.out.println("\t\t      ••••••    ¶ ¶    ¶ ¶        ¶ ¶          ¶ ¶     ¶ ¶                     ••••••   ");
System.out.println("\t\t     •••••••    ¶ ¶   ¶ ¶         ¶ ¶           ¶ ¶    ¶ ¶                     •••••••   ");
System.out.println("\t\t    ••••••••    ¶ ¶  ¶ ¶          ¶ ¶           ¶ ¶    ¶ ¶                     ••••••••   ");
System.out.println("\t\t   •••••••••    ¶ ¶ ¶ ¶           ¶ ¶          ¶ ¶     ¶ ¶                     •••••••••   ");
System.out.println("\t\t  ••••••••••    ¶ ¶¶ ¶            ¶ ¶¶¶¶¶¶¶¶¶¶¶ ¶      ¶ ¶                     ••••••••••   ");
System.out.println("\t\t   •••••••••    § §§ §            § §§§§§§§§§§§ §      § §                     •••••••••  ");
System.out.println("\t\t    ••••••••    § § § §           § §          § §     § §                     ••••••••   ");
System.out.println("\t\t     •••••••    § §  § §          § §           § §    § §                     •••••••   ");
System.out.println("\t\t      ••••••    § §   § §         § §          § §     § §                     ••••••  ");
System.out.println("\t\t       •••••    § §    § §        § §§§§§§§§§§§ §      § §§§§§§§§§§§§§§§§§§    ••••  ");
System.out.println("\t\t        ••••    § §     § §       §§§§§§§§§§§§§§       §§§§§§§§§§§§§§§§§§§§    •••   ");
System.out.println("\t\t         •••                                                                   •• ");
System.out.println("\t\t          ••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••    ");
System.out.println("\t\t     ");
       }
            else    {
           

	System.out.print("                        _______________________________________________________  \n");
	System.out.print("                      /|                                                       | \n");
	System.out.print("                     | |  * *     * *    * ** ** ** ** *   * ** ** ** ** **    | \n");
	System.out.print("                     | |  * *    * *     * ** ** ** ** *   * ** ** ** ** **    | \n");
       System.out.print("                     | |  * *   * *      * *         * *   * *                 | \n");
       System.out.print("                     | |  * *  * *       * *         * *   * *                 | \n");
	System.out.print("                     | |  * * * *        * *         * *   * *                 | \n");
	System.out.print("                     | |  * *  *         * ** ** ** ** *   * *                 | \n");
	System.out.print("                     | |  * * * *        * ** ** ** ** *   * *                 | \n");
       System.out.print("                     | |  * *  * *       * *         * *   * *                 | \n");
       System.out.print("                     | |  * *   * *      * *         * *   * *                 | \n");
       System.out.print("                     | |  * *    * *     * ** ** ** ** *   * ** ** ** ** **    | \n");
	System.out.print("                     | |  * *     * *.   * ** ** ** ** * . * ** ** ** ** **    | \n");
	System.out.print("                     | |_______________________________________________________| \n");
	System.out.print("                     |/_______________________________________________________/\n"); 
           
       }
   
         
       
         System.out.print("\nCreated by:-");
         Thread.sleep(500);
         System.out.print("R");
         Thread.sleep(500);
         System.out.print("O");
         Thread.sleep(500);
         System.out.print("C");
         Thread.sleep(500);
         System.out.print("K");
         Thread.sleep(500);
         System.out.print("S");
         		
         Thread.sleep(500);
         System.out.print("T");
          Thread.sleep(500);
         System.out.print("A");
         Thread.sleep(500);
         System.out.print("R");
         Thread.sleep(500);
        
       
                   Thread.sleep(2500);
                   
         for(int clr=1;clr<=25;clr++){
         System.out.println("");}
         System.out.println("++++++++++++++++++++++++++");
         System.out.println("+   Enter Your choice    +");
         System.out.println("++++++++++++++++++++++++++");
         System.out.println("+ 1.Play                 +");
         System.out.println("++++++++++++++++++++++++++");
          for(int clr=1;clr<=25;clr++){
         System.out.println("");}          
         Thread.sleep(1100);
      
      /*   System.out.println("++++++++++++++++++++++++++");
         System.out.println("+   Enter Your choice    +");*/
         System.out.println("++++++++++++++++++++++++++");
      //   System.out.println("+ 1.Play                 +");
         System.out.println("+ 2.Practise zone        +");
         System.out.println("++++++++++++++++++++++++++");
            for(int clr=1;clr<=24;clr++){
         System.out.println("");} 
                   Thread.sleep(1100);
          for(int clr=1;clr<=25;clr++){
         System.out.println("");} 
       /*  System.out.println("++++++++++++++++++++++++++");
         System.out.println("+   Enter Your choice    +");*/
         System.out.println("++++++++++++++++++++++++++");
      //   System.out.println("+ 1.Play                 +");
      //   System.out.println("+ 2.Practise zone        +");
         System.out.println("+ 3.Customize Your Game      +");
         System.out.println("++++++++++++++++++++++++++");
           for(int clr=1;clr<=23;clr++){
         System.out.println("");} 
         
         Thread.sleep(1100);
         for(int clr=1;clr<=25;clr++){
         System.out.println("");}
         System.out.println("++++++++++++++++++++++++++");
       /*  System.out.println("+   Enter Your choice    +");
         System.out.println("++++++++++++++++++++++++++");
         System.out.println("+ 1.Play                 +");
         System.out.println("+ 2.Practise zone        +");
         System.out.println("+ 3.Your last Score      +");*/
         System.out.println("+ 4.History & Performance          +");
         System.out.println("++++++++++++++++++++++++++");
       
         for(int clr=1;clr<=22;clr++){
         System.out.println("");}
            Thread.sleep(1100);
         for(int clr=1;clr<=25;clr++){
         System.out.println("");}
         System.out.println("++++++++++++++++++++++++++");
      /*   System.out.println("+   Enter Your choice    +");
         System.out.println("++++++++++++++++++++++++++");
         System.out.println("+ 1.Play                 +");
         System.out.println("+ 2.Practise zone        +");
         System.out.println("+ 3.Your last Score      +");
         System.out.println("+ 4.History & Withdraw            +");*/
         System.out.println("+ 5.About Us                 +");
         System.out.println("++++++++++++++++++++++++++");
       
         for(int clr=1;clr<=21;clr++){
         System.out.println("");}
            Thread.sleep(1100);

         System.out.println("++++++++++++++++++++++++++");
        System.out.println("+   Enter Your choice    +");
         System.out.println("++++++++++++++++++++++++++");
         System.out.println("+ 1.Play                 +");
         System.out.println("+ 2.Practise zone        +");
         System.out.println("+ 3.Customize Your Game      +");
         System.out.println("+ 4.History & Performance           +");
         System.out.println("+ 5.About Us                +");
         System.out.println("+ 6.Exit                 +");
         System.out.println("++++++++++++++++++++++++++");
          for(int clr=1;clr<=19;clr++){
         System.out.println("");}
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        int enter=m.nextInt();
        if(enter==1){ 
            System.out.println("\nTo Register for the game full fill the requirement");
            System.out.println("\nEnter your name:-");
            sname=m.next();
            System.out.println("Enter your Age:-");
            age=m.nextInt();
            int rs=0;//statement.executeUpdate("insert into score(name,age) values('"+sname+"',"+age+");");
            int sc=0;//statement.executeUpdate("update score set score=0 where name like '"+sname+"' && age="+age+";");
            System.out.println("Hello "+sname+" welcome to K.B.C");
            for(int b=1;b<=5;b++){
                for(int a=1;a<=22;a++){
                 System.out.println();} 
             System.out.println("   •  ") ;  
             System.out.println("   •  ");
             System.out.println("   •  ");
         for(int a=1;a<=26;a++){
                 System.out.println();}
         System.out.println("Loading");
         Thread.sleep(250);
           System.out.println();
           System.out.println();
             System.out.println("    •  ") ;  
             System.out.println("   •  ");
             System.out.println("  •  ");   
             for(int a=1;a<=26;a++){
                 System.out.println();}
             System.out.println("Loading..");
         Thread.sleep(250);
         System.out.println();
         System.out.println();
             System.out.println("      ") ;  
             System.out.println("•  •  • ");
             System.out.println("    ");   
             for(int a=1;a<=26;a++){
                 System.out.println();}
             System.out.println("Loading...");
         Thread.sleep(250);
         System.out.println();
         System.out.println();
             System.out.println("  •   ") ;  
             System.out.println("   •  ");
             System.out.println("    •");   
             for(int a=1;a<=26;a++){
                 System.out.println();}
                 System.out.println("Loading...");
          }
          System.out.println();
          System.out.println("\n");
             System.out.println("   •  ") ;  
             System.out.println("   •  ");
             System.out.println("   •  ");
         for(int a=1;a<=26;a++){
                 System.out.println();}
         System.out.println("Done.....");
         System.out.println("ALL THE VERY BEST "+ sname);
         Thread.sleep(1000);
         long timeLimit = 20000; // 20 seconds in milliseconds
         long startTime = System.currentTimeMillis();
         long endTime = startTime + timeLimit;
         final String[] userInput = {null}; // Array to allow modification inside the thread
        // long endTime = System.currentTimeMillis() + 10000;

         System.out.println("Rule: You have 20 seconds to answer the question. After that, the game will exit!");

         //Scanner m1 = new Scanner(System.in);

         System.out.println("\n\n\n\n\t\t\tFastest Finger Question");
         Random ran = new Random();
         int questionType = ran.nextInt(3); // Randomly decide the type of question (0, 1, or 2)

         String ffq = null;

         // Display the question
         if (questionType == 0) {
             System.out.println("Arrange these words in the correct order to form a Hindi Proverb–");
             System.out.println("A Dum                            B Karna \n");
             System.out.println("C Naak                           D Mein    ");
         } else if (questionType == 1) {
             System.out.println("Arrange these words in the correct order to form the slogan of the Pulse Polio campaign in India?");
             System.out.println("(A) Zindagi                       (B) Do  \n");
             System.out.println("(C) Boond                         (D) Ki    ");
         } else {
             System.out.println("Starting with the earliest, arrange the following events in Narendra Modi’s life in chronological order.");
             System.out.println("(A) CM of Gujarat                 (B) Took oath as PM \n");
             System.out.println("(C) Joined BJP                    (D) Became RSS Pracharak    ");
         }

         for (int clr = 1; clr <= 25; clr++) {
             System.out.println("");
         }

         // Timer and Input Handling
         boolean answered = false;
         System.out.print("Your Answer: "); // Initial prompt for user input


      
         Thread inputThread = new Thread(new Runnable() {
             @Override
             public void run() {
                 Scanner inputScanner = new Scanner(System.in);
                 System.out.print("Your Answer: "); // Prompt user for input
                 if (inputScanner.hasNextLine()) {
                     userInput[0] = inputScanner.nextLine().trim(); // Save user input
                 }
                 inputScanner.close(); // Close the scanner to avoid resource leak
             }
         });

        
		inputThread.start();
         

         // Create and start the input thread
        
         // Timer countdown loop
         while (System.currentTimeMillis() < endTime) {
             long remainingTime = endTime - System.currentTimeMillis();
             long remainingSeconds = remainingTime / 1000;

           

             if (userInput[0] != null) {
                 answered = true; // Mark as answered
                 break;
             }

             Thread.sleep(100); // Small delay for smoother countdown
         }

         // After the timer or user input
         if (!answered) {
             System.out.println("\nTime's up! You didn't answer in time. Exiting...");
             return;
         }

         System.out.println(); // Move to the next line after timer countdown is done

         // Check the user's answer based on the question type
         switch (questionType) {
             case 0:
                 if (userInput[0].equalsIgnoreCase("CDAB")) {
                     System.out.println("Correct answer!");
                 } else {
                     System.out.println("Incorrect answer. The correct answer is: CDAB");
                 }
                 break;

             case 1:
                 if (userInput[0].equalsIgnoreCase("BCAD")) {
                     System.out.println("Correct answer!");
                 } else {
                     System.out.println("Incorrect answer. The correct answer is: BCAD");
                 }
                 break;

             case 2:
                 if (userInput[0].equalsIgnoreCase("DCAB")) {
                     System.out.println("Correct answer!");
                 } else {
                     System.out.println("Incorrect answer. The correct answer is: DCAB");
                 }
                 break;

             default:
                 System.out.println("Unexpected question type.");
         }
         String[] questions = {
                 "Which of the following name means 'Person of long age'?",
                 "What is the capital of Australia?",
                 "Which animal is known as the 'Ship of the Desert'?",
                 "How many states are there in India?",
                 "Which planet is known as the Red Planet?"
         };

         String[][] options = {
                 {"(A) Abhitabh", "(B) Arunodaya", "(C) Abhishek", "(D) Ayushmaan"},
                 {"(A) Sydney", "(B) Melbourne", "(C) Canberra", "(D) Brisbane"},
                 {"(A) Horse", "(B) Elephant", "(C) Camel", "(D) Donkey"},
                 {"(A) 28", "(B) 27", "(C) 26", "(D) 25"},
                 {"(A) Earth", "(B) Mars", "(C) Jupiter", "(D) Venus"}
         };

         String[] correctAnswers = {"D", "C", "C", "A", "B"};
         // Randomly select one question
         Random rand = new Random();
         int questionIndex = rand.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 2,000 is |");
         System.out.println(questions[questionIndex] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options[questionIndex][0] + "            " + options[questionIndex][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options[questionIndex][2] + "            " + options[questionIndex][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first = System.currentTimeMillis();
         String answer = m.next();
         long second = System.currentTimeMillis();
         long timer = second - first;

         // Check for 30-second time limit
         if (timer > 31000) {
             System.out.println("Sorry, you are too late. You have 30 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options[questionIndex], correctAnswers[questionIndex]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 2000; // Update the amount won for the round
                         previous(options[questionIndex], correctAnswers[questionIndex]);  // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options[questionIndex], correctAnswers[questionIndex]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers5[questionIndex] + ").");
                 	expert(options[questionIndex], correctAnswers[questionIndex]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer = m.next();
         }

         // Validate answer
         if (answer.equalsIgnoreCase(correctAnswers[questionIndex])) {
         	 System.out.println("Yes, you are right! You won Rs.2,000");
              rupess = 2000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers[questionIndex]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         String[] questions1 = {
                 "Which element is represented by the symbol 'O' in the periodic table??",
                 "What is the main ingredient in guacamole??",
                 "Which famous painting was created by Leonardo da Vinci?",
                 "What is the boiling point of water at sea level in degrees Celsius?",
                 "Which organ in the human body is primarily responsible for detoxification?"
         };

         String[][] options1 = {
                 {"(A) Gold ","(B) Oxygen","(C) Osmium","(D) Oganesson"},
                 {"(A) Tomato", "(B) Avacado", "(C) Onion", "(D) Pepper"},
                 {"(A) The Starry Night", "(B) The Scream", "(C) The Last Supper", "(D) Girl With a Pearl Earring"},
                 {"(A) 50", "(B) 150", "(C) 200", "(D) 100"},
                 {"(A) Liver", "(B) Heart", "(C) Kidney", "(D) Lungs"}
         };

         String[] correctAnswers1 = {"B", "B", "C", "D", "A"};


         // Randomly select one question
         Random rand1 = new Random();
         int questionIndex1 = rand1.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 5,000 is |");
         System.out.println(questions1[questionIndex1] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options1[questionIndex1][0] + "            " + options1[questionIndex1][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options1[questionIndex1][2] + "            " + options1[questionIndex1][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first1 = System.currentTimeMillis();
         String answer1 = m.next();
         long second1 = System.currentTimeMillis();
         long timer1 = second1 - first1;

         // Check for 30-second time limit
         if (timer1 > 31000) {
             System.out.println("Sorry, you are too late. You have 30 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer1.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options1[questionIndex1], correctAnswers1[questionIndex1]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 5000; // Update the amount won for the round
                         previous(options1[questionIndex1], correctAnswers1[questionIndex1]); // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options1[questionIndex1], correctAnswers1[questionIndex1]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers5[questionIndex] + ").");
                 	expert(options1[questionIndex1], correctAnswers1[questionIndex1]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer1 = m.next();
         }

         // Validate answer
         if (answer1.equalsIgnoreCase(correctAnswers1[questionIndex1])) {
         	 System.out.println("Yes, you are right! You won Rs.2,00,000");
              rupess = 5000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers1[questionIndex1]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         
         String[] questions2 = {
                 "When Mowgli has killed Shere Khan, and returns to the village, what is he greeted by?",
                 "Farokh Engineer played his last Test match at his home ground. Where did he play his last Test match?",
                 "The first graphical browser for the WWW was named: ?",
                 "Today Cadbury uses high quality cocoa beans from which location?",
                 "In the epic Ramayana, which bird tried to prevent Ravana from carrying Sita away?"
         };

         String[][] options2 = {
                 {"(A) Cheers ","(B) The Police","(C) Stone and Crushes","(D) Buldeo Pratap"},
                 {"(A) Delhi", "(B) Calcutta", "(C) Hyderabad", "(D) Mumbai"},
                 {"(A) Mosaic", "(B) NetScape", "(C) Veronica", "(D) Explorer"},
                 {"(A) West Africa", "(B) India", "(C) North Africa", "(D) South America"},
                 {"(A) Vibhishan", "(B) Jatayu", "(C) Garuda", "(D) Bhulinga"}
         };

         String[] correctAnswers2 = {"C", "D", "A", "A", "B"};

         // Randomly select one question
         Random rand2 = new Random();
         int questionIndex2 = rand2.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 6,00,000 is |");
         System.out.println(questions2[questionIndex2] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options2[questionIndex2][0] + "            " + options2[questionIndex2][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options2[questionIndex2][2] + "            " + options2[questionIndex2][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first2 = System.currentTimeMillis();
         String answer2 = m.next();
         long second2 = System.currentTimeMillis();
         long timer2 = second2 - first2;

         // Check for 30-second time limit
         if (timer2 > 31000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer2.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options2[questionIndex2], correctAnswers2[questionIndex2]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 10000; // Update the amount won for the round
                         previous(options2[questionIndex2], correctAnswers2[questionIndex2]); // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options2[questionIndex2], correctAnswers2[questionIndex2]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                 	expert(options2[questionIndex2], correctAnswers2[questionIndex2]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer2 = m.next();
         }

         // Validate answer
         if (answer2.equalsIgnoreCase(correctAnswers2[questionIndex2])) {
         	 System.out.println("Yes, you are right! You won Rs.10,000");
              rupess = 10000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers2[questionIndex2]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         
         String[] questions3 = {
                 
                 "Which country is the largest producer of coffee in the world?",
             "Which ancient civilization is credited with the invention of the first known writing system, cuneiform?",
             "Who is the founder of the political party Dravida Munnetra Kazhagam (DMK) ?",
             "Which Mughal Emperor was deported to Rangoon by the British?",
             "Where is the largest Buddhist Monastery in India located?"

     };

     String[][] options3 = {
             {"(A) Brazil ","(B) Colombia","(C) Vietnam","(D) Ethiopia"},
             {"(A) Egyptians", "(B) Greeks", "(C) Sumerians", "(D) Romans"},
             {"(A) C.N, Annadurai", "(B) M.Karuanidhi", "(C) M.G. Ramachandran", "(D) Jayalalitha"},
             {"(A) Shah Jahan", "(B) Bahadur Shah II ", "(C) Akbar Shah I", "(D) Bahadur Shah I"},
             {"(A) Sarnath,Uttar Pradesh", "(B) Gangtok,Sikkim", "(C) Dharmashala,Himachal Pradesh", "(D) Tawang,Arunachal Pradesh"}
     };

     String[] correctAnswers3 = {"A", "C", "A", "B", "D"};


         // Randomly select one question
         Random rand3 = new Random();
         int questionIndex3 = rand3.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 20,000 is |");
         System.out.println(questions3[questionIndex3] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options3[questionIndex3][0] + "            " + options3[questionIndex3][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options3[questionIndex3][2] + "            " + options3[questionIndex3][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first3 = System.currentTimeMillis();
         String answer3 = m.next();
         long second3 = System.currentTimeMillis();
         long timer3 = second3 - first3;

         // Check for 30-second time limit
         if (timer3 > 31000) {
             System.out.println("Sorry, you are too late. You have 30 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer3.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options3[questionIndex3], correctAnswers3[questionIndex3]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 20000; // Update the amount won for the round
                         previous(options3[questionIndex3], correctAnswers3[questionIndex3]); // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options3[questionIndex3], correctAnswers3[questionIndex3]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                 	expert(options3[questionIndex3], correctAnswers3[questionIndex3]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer3 = m.next();
         }

         // Validate answer
         if (answer3.equalsIgnoreCase(correctAnswers3[questionIndex3])) {
         	 System.out.println("Yes, you are right! You won Rs.20,000");
              rupess = 20000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers3[questionIndex3]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         
         String[] questions4 = {
                 
                 "The fine step-well complex of 'Agrasen ki Baoli' is located at : ",
             "The National Stadium in Delhi was earlier known by the name ?",
             "The theme of the World Red Cross and Red Crescent Day was ?",
             "Which of these scientists doesn’t have a chemical element named for him?",
             "From the following pairs of currencies and countries, which is not correct?"

     };

     String[][] options4 = {
             {"(A) Gwailor ","(B) Amritsar","(C) Agra","(D) New Delhi"},
             {"(A) Irwin Stadium", "(B) MountBatten Stadium", "(C) Wellington Stadium", "(D) Canning Stadium"},
             {"(A)  Nourishment for all-focus on children", "(B) Dignity for all – focus on Children", "(C) Focus on health for all", "(D) None of These"},
             {"(A) Enrico Fermi", "(B) Niels Bohr ", "(C)  Albert Einstein", "(D) Isaac Newton"},
             {"(A) Bangladesh – Taka", "(B) North Korea – Won", "(C) Japan – Yuan", "(D) Saudi Arabia – Rial"}
     };

     String[] correctAnswers4 = {"D", "A", "B", "D", "C"};

             // Randomly select one question
             Random rand4 = new Random();
             int questionIndex4 = rand4.nextInt(5); // Random number between 0 and 4

             System.out.println("\t\t\t\t\t\t _____________________________");
             System.out.println("\t\t\t\t\t\t| Your Question for Rs 40,000 is |");
             System.out.println(questions4[questionIndex4] + "                                    \t\t|-----------Lifeline------------|");
             System.out.println(options4[questionIndex4][0] + "            " + options4[questionIndex4][1] + "                           \t\t| 1. 50:50                       |");
             System.out.println("                                                                                     \t\t| 2. Flip Question              |");
             System.out.println(options4[questionIndex4][2] + "            " + options4[questionIndex4][3] + "                           \t\t| 3. Audience Poll               |");
             System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

             for (int clr = 1; clr <= 5; clr++) {
                 System.out.println(""); // Add extra spacing
             }

             System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
             long first4 = System.currentTimeMillis();
             String answer4 = m.next();
             long second4 = System.currentTimeMillis();
             long timer4 = second4 - first4;

             // Check for 30-second time limit
             if (timer4 > 31000) {
                 System.out.println("Sorry, you are too late. You have 30 seconds to give an answer.");
                 Thread.sleep(1500);
                 return;
             }

                
             while (answer4.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
                 lifelineUsed++;
                 System.out.println("Choose your lifeline:");

                 boolean lifelineAvailableFlag = false;
                 for (int i = 0; i < lifelineAvailable.length; i++) {
                     if (lifelineAvailable[i]) {
                         lifelineAvailableFlag = true;
                         switch (i) {
                             case 0:
                                 System.out.println("1. 50:50");
                                 break;
                             case 1:
                                 System.out.println("2. Flip Question");
                                 
                                 break;
                             case 2:
                                 System.out.println("3. Audience Poll");
                                 break;
                             case 3:
                                 System.out.println("4. Ask the Expert");
                                 break;
                         }
                     }
                 }

                 if (!lifelineAvailableFlag) {
                     System.out.println("No lifelines available!");
                     break;
                 }

                 int lifelineChoice = m.nextInt();

                 if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                     System.out.println("Invalid or already used lifeline choice. Try again.");
                     continue;
                 }

                 lifelineAvailable[lifelineChoice - 1] = false;

                 switch (lifelineChoice) {
                     case 1:
                         System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                         printFiftyFiftyOptions(options4[questionIndex4], correctAnswers4[questionIndex4]);
                         break;
                     case 2:
                     	System.out.println("Flip Question: Choose a category from the following:");
                         String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                         for (int j = 0; j < categories.length; j++) {
                             System.out.println((j + 1) + ". " + categories[j]);
                         }
                         Scanner scanner = new Scanner(System.in);
                         int categoryChoice = scanner.nextInt();
                         if (categoryChoice < 1 || categoryChoice > 8) {
                             System.out.println("Invalid category choice.");
                             break;
                         }

                         System.out.println("You chose: " + categories[categoryChoice - 1]);

                         // Generate the question and retrieve the correct answer
                         String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                         // Prompt the user for their answer
                         System.out.print("\nYour Answer: ");
                         
                         String userAnswer = scanner.next();

                         // Validate the new answer
                         if (validateNewAnswer(userAnswer, correctAnswer)) {
                             System.out.println("Correct! Proceeding to the next round.");
                             // Update the winnings and proceed to the next question
                             rupess = 40000; // Update the amount won for the round
                              previous(options4[questionIndex4], correctAnswers4[questionIndex4]); // Proceed to the next round

                         } else {
                             System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                             System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                             System.out.println("Thank you for playing!");
                             return; // End the game
                         }
                     case 3:
                         //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                     	audiencePoll(options4[questionIndex4], correctAnswers4[questionIndex4]);
                         break;
                     case 4:
                         //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                     	expert(options4[questionIndex4], correctAnswers4[questionIndex4]);
                         break;
                 }

                 System.out.print("\nFinal Ans:- ");
                 answer4 = m.next();
             }

             // Validate answer
             if (answer4.equalsIgnoreCase(correctAnswers4[questionIndex4])) {
             	 System.out.println("Yes, you are right! You won Rs.40,000");
                  rupess = 40000;

             } else {
                 System.out.println("Incorrect answer. The correct answer is: " + correctAnswers4[questionIndex4]);
                 System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                 return;
             }
             System.out.println("Congrats !! For Clearing ROUND  1 ");
             for(int i = 0;i<3;i++) {
             	System.out.println();
             }

             System.out.println("WELCOME TO ROUND  2  : ");
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             
             System.out.println(" Here You will Get 60 Sec to Answer Your Question ");
         String[] questions5 = {
                 "Shimla pact between India and Pakistan was signed in ?",
                 "Gunnar Myrdal has dealt with the problem of Asian Countries in 'Asian Drama' regarding?",
                 "The book 'All Under Heaven' was written by - ",
                 "In which of these sectors was 51% FDI permitted by the Government of India in 2012?",
                 " Which of these metals or non-metals is the main constituent of both brass and bronze ?"
         };

         String[][] options5 = {
                 {"(A) 1949", "(B) 1965", "(C) 1971", "(D) 1972"},
                 {"(A) Modern Countries", "(B) Poverty", "(C) Military Dictatorship ", "(D)Neo - Colonialism "},
                 {"(A) Pearl S.Buck", "(B) Sydney Sheldon", "(C) T.S. Eliot", "(D) George Bernard Sha"},
                 {"(A) Multi-brand retail ", "(B) Healthcare ", "(C) Life Insurance ", "(D) Civil Aviation"},
                 {"(A) Carbon ", "(B) Lead", "(C) Copper", "(D) Silver"}
         };

         String[] correctAnswers5 = {"D", "B", "A", "A", "C"};

         // Randomly select one question
         Random rand5 = new Random();
         int questionIndex5 = rand5.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 80,000 is |");
         System.out.println(questions5[questionIndex5] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options5[questionIndex5][0] + "            " + options5[questionIndex5][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options5[questionIndex5][2] + "            " + options5[questionIndex5][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first5 = System.currentTimeMillis();
         String answer5 = m.next();
         long second5 = System.currentTimeMillis();
         long timer5 = second5 - first5;

         // Check for 30-second time limit
         if (timer5 > 61000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer5.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options5[questionIndex5], correctAnswers5[questionIndex5]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 80000; // Update the amount won for the round
                          // Proceed to the next round
                         previous(options5[questionIndex5], correctAnswers5[questionIndex5]);
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options5[questionIndex5], correctAnswers5[questionIndex5]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers5[questionIndex] + ").");
                 	expert(options5[questionIndex5], correctAnswers5[questionIndex5]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer5 = m.next();
         }

         // Validate answer
         if (answer5.equalsIgnoreCase(correctAnswers5[questionIndex5])) {
         	 System.out.println("Yes, you are right! You won Rs.80,000");
              rupess = 80000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers5[questionIndex5]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         String[] questions6 = {
                 "In the film Sholay, what instrument does Jay play?",
                 "Which colonial power introduced the cultivation and consumption of cashew, potato, tomato and chilli to India ?",
                 "In 1943, which industrialist established the United Commercial Bank , now known as UCO Bank ? ",
                 "Which of these is the name of a Multi-course meal in Kashmiri Cuisine ?",
                 " Which of these sports commences when the referee tosses the ball into the air over the centre circle ?"
         };

         String[][] options6 = {
                 {"(A) Bhansuri ", "(B) Guitar", "(C) Mouth Organ", "(D) Harmonium"},
                 {"(A) British ", "(B) Dutch", "(C) France ", "(D) Portuguese"},
                 {"(A) Jamnalal Bajaj ", "(B)  Ambalal sarabhai", "(C) Ghanshayam Das Birla", "(D)  Nowroji Saklatwala"},
                 {"(A)  Wazwan ", "(B)  Gushtaba ", "(C) Yakhni ", "(D) Rogan Josh"},
                 {"(A) Volleyball ", "(B)  Basketball", "(C) Football", "(D) Tennis"}
         };

         String[] correctAnswers6 = {"C", "D", "C", "A", "B"};

         // Randomly select one question
         Random rand6 = new Random();
         int questionIndex6 = rand6.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 2,00,000 is |");
         System.out.println(questions6[questionIndex6] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options6[questionIndex6][0] + "            " + options6[questionIndex6][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options6[questionIndex6][2] + "            " + options6[questionIndex6][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first6 = System.currentTimeMillis();
         String answer6 = m.next();
         long second6 = System.currentTimeMillis();
         long timer6 = second6 - first6;

         // Check for 30-second time limit
         if (timer6 > 61000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer6.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options6[questionIndex6], correctAnswers6[questionIndex6]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 200000; // Update the amount won for the round
                          // Proceed to the next round
                         //System.out.println("The Answer for Previous Question is : "+)
                         previous(options6[questionIndex6], correctAnswers6[questionIndex6]);
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options6[questionIndex6], correctAnswers6[questionIndex6]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers5[questionIndex] + ").");
                 	expert(options6[questionIndex6], correctAnswers6[questionIndex6]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer6 = m.next();
         }

         // Validate answer
         if (answer6.equalsIgnoreCase(correctAnswers6[questionIndex6])) {
         	 System.out.println("Yes, you are right! You won Rs.2,00,000");
              rupess = 200000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers6[questionIndex6]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         String[] questions7 = {
                 "Complete this Hindi proverb : “Kaam ka na kaaj ka __________ ” ?",
                 " According to Hindu mythology, which of these events occurred in Mathura?",
                 " Which of these is the name of a plant which is usually kept in the house to bring good luck ? ",
                 " Which of these names means ‘imperishable’ or ‘undecaying’?",
                 "  In which film did this song feature? (Song: Gaata rahe mera dil)"
         };

         String[][] options7 = {
                 {"(A) Boli bole pahaad si ", "(B)Kapda pahne fashion ka ", "(C) Dushman anaaj ka", "(D) Khoon peeye baap ka"},
                 {"(A)  Draupadi’s Swayamvar  ", "(B) Bhishma Pratigya", "(C) Krishna’s death ", "(D) Kansa Vadh"},
                 {"(A) Currency tree ", "(B)   Money Plant", "(C) Dollar Grass", "(D)  Dinar Shrub"},
                 {"(A) Akshay  ", "(B)  Abhay ", "(C) Aamir  ", "(D) Anurag "},
                 {"(A) Johny mera Naam", "(B) Heeran Panna", "(C) Jewel Thief", "(D) Guide"}
         };

         String[] correctAnswers7 = {"C", "D", "B", "A", "D"};

         // Randomly select one question
         Random rand7 = new Random();
         int questionIndex7 = rand7.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 6,00,000 is |");
         System.out.println(questions7[questionIndex7] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options7[questionIndex7][0] + "            " + options7[questionIndex7][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options7[questionIndex7][2] + "            " + options7[questionIndex7][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first7 = System.currentTimeMillis();
         String answer7 = m.next();
         long second7 = System.currentTimeMillis();
         long timer7 = second7 - first7;

         // Check for 30-second time limit
         if (timer7 > 61000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer7.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options7[questionIndex7], correctAnswers7[questionIndex7]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 600000; // Update the amount won for the round
                         previous(options7[questionIndex7], correctAnswers7[questionIndex7]); // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options7[questionIndex7], correctAnswers7[questionIndex7]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                 	expert(options7[questionIndex7], correctAnswers7[questionIndex7]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer7 = m.next();
         }

         // Validate answer
         if (answer7.equalsIgnoreCase(correctAnswers7[questionIndex7])) {
         	 System.out.println("Yes, you are right! You won Rs.6,00,000");
              rupess = 600000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers7[questionIndex7]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         String[] questions8 = {
                 " In Hindi cinema, by what name is the R&AW agent Avinash Singh Rathore better known as ?",
                 " The Union Carbide plant in Bhopal used to produce which of these products?",
                 "  Which of these structures was part of Delhi’s historical city of Shahjahanabad? ",
                 " Which of these days of the week is also known as ‘Jumeraat’?",
                 " Which god is Sri Vitthal in Pandharpur, Maharashtra believed to be a manifestation of ?"
         };

         String[][] options8 = {
                 {"(A)  Rowdy Rathore ", "(B) Agent Vinod ", "(C) Lovely Singh ", "(D) Tiger "},
                 {"(A) Pharmaceutical drugs ", "(B)  pesticides ", "(C) Nuclear Weapons  ", "(D) Plastic "},
                 {"(A) Red Fort ", "(B) India Gate ", "(C) Qutub Minar ", "(D)  Humayun’s tomb "},
                 {"(A) Wednesday ", "(B) Saturday ", "(C) Friday ", "(D) Thursday "},
                 {"(A) Brahma ", "(B)  Kartikeya ", "(C) Vishnu ", "(D) Ganesha "}
         };

         String[] correctAnswers8 = {"D", "B", "A", "D", "C"};

         // Randomly select one question
         Random rand8 = new Random();
         int questionIndex8 = rand8.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 12,00,000 is |");
         System.out.println(questions8[questionIndex8] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options8[questionIndex8][0] + "            " + options8[questionIndex8][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options8[questionIndex8][2] + "            " + options8[questionIndex8][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first8 = System.currentTimeMillis();
         String answer8 = m.next();
         long second8 = System.currentTimeMillis();
         long timer8 = second8 - first8;

         // Check for 30-second time limit
         if (timer8 > 61000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer8.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options8[questionIndex8], correctAnswers8[questionIndex8]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 1200000; // Update the amount won for the round
                         previous(options8[questionIndex8], correctAnswers8[questionIndex8]); // Proceed to the next round
                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options8[questionIndex8], correctAnswers8[questionIndex8]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                 	expert(options8[questionIndex8], correctAnswers8[questionIndex8]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer8 = m.next();
         }

         // Validate answer
         if (answer8.equalsIgnoreCase(correctAnswers8[questionIndex8])) {
         	 System.out.println("Yes, you are right! You won Rs.12,00,000");
              rupess = 1200000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers8[questionIndex8]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         } 
         String[] questions9 = {
                 " Who founded the newspapers ‘Saamana’ in Marathi and ‘Dopahar ka Saamana’ in Hindi ?",
                 " Who was the Scientific Adviser to the Defence Minister of India during Pokhran II ?",
                 " Which of these phrases means “to bribe”? ",
                 " According to the opening credits, which Hindi film is based on the play Kishan vs Kanhaiya?",
                 " Whose autobiography is “My unforgettable memories”, which is dedicated to “Mom, Mati and Manush”?"
         };

         String[][] options9 = {
                 {"(A) Sharad Pawar ", "(B) Bal Thakeray ", "(C) Vasantrao Chavan ", "(D)  Vilasrao Deshmukh "},
                 {"(A) Dr R. Chidambaram ", "(B)  Dr. A.P.J. Abdul Kalam ", "(C)  Dr. Anil Kakodkar ", "(D)  Dr K. Kasturlrangan"},
                 {"(A) Jeb Tatolna ", "(B) Collar Uthana ", "(C)  Pocket Garam Karna ", "(D) Baaju Chadana "},
                 {"(A) Kishen Kanhaiya ", "(B) Ladies vs Ricky Bahl ", "(C)  Mittal vs Mittal ", "(D) OMG Oh My God!"},
                 {"(A) Pranab Mukherjee ", "(B)  Jyoti basu ", "(C) Tasleema Nasreen ", "(D) Mamata Banerjee "}
         };

         String[] correctAnswers9 = {"B", "B", "C", "D", "D"};

         // Randomly select one question
         Random rand9 = new Random();
         int questionIndex9 = rand9.nextInt(5); // Random number between 0 and 4

         System.out.println("\t\t\t\t\t\t _____________________________");
         System.out.println("\t\t\t\t\t\t| Your Question for Rs 25,00,000 is |");
         System.out.println(questions9[questionIndex9] + "                                    \t\t|-----------Lifeline------------|");
         System.out.println(options9[questionIndex9][0] + "            " + options9[questionIndex9][1] + "                           \t\t| 1. 50:50                       |");
         System.out.println("                                                                                     \t\t| 2. Flip Question              |");
         System.out.println(options9[questionIndex9][2] + "            " + options9[questionIndex9][3] + "                           \t\t| 3. Audience Poll               |");
         System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");

         for (int clr = 1; clr <= 5; clr++) {
             System.out.println(""); // Add extra spacing
         }

         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:- ");
         long first9 = System.currentTimeMillis();
         String answer9 = m.next();
         long second9 = System.currentTimeMillis();
         long timer9 = second9 - first9;

         // Check for 30-second time limit
         if (timer9 > 61000) {
             System.out.println("Sorry, you are too late. You have 60 seconds to give an answer.");
             Thread.sleep(1500);
             return;
         }

            
         while (answer9.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             lifelineUsed++;
             System.out.println("Choose your lifeline:");

             boolean lifelineAvailableFlag = false;
             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options9[questionIndex9], correctAnswers9[questionIndex9]);
                     break;
                 case 2:
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 2500000; // Update the amount won for the round
                          previous(options9[questionIndex9], correctAnswers9[questionIndex9]); // Proceed to the next round

                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     //System.out.println("Audience Poll: Majority votes for option (" + correctAnswers[questionIndex] + ").");
                 	audiencePoll(options9[questionIndex9], correctAnswers9[questionIndex9]);
                     break;
                 case 4:
                     //System.out.println("Ask the Expert: The expert says the answer is option (" + correctAnswers[questionIndex] + ").");
                 	expert(options9[questionIndex9], correctAnswers9[questionIndex9]);
                     break;
             }

             System.out.print("\nFinal Ans:- ");
             answer9 = m.next();
         }

         // Validate answer
         if (answer9.equalsIgnoreCase(correctAnswers9[questionIndex9])) {
         	 System.out.println("Yes, you are right! You won Rs.25,00,000");
              rupess = 2500000;

         } else {
             System.out.println("Incorrect answer. The correct answer is: " + correctAnswers9[questionIndex9]);
             System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
             return;
         }
         System.out.println("Congrats !! For Clearing ROUND  2");
         for(int i = 0;i<3;i++) {
         	System.out.println();
         }
         System.out.println("WELCOME TO ROUND  3  : ");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         
         System.out.println(" There is NO Time-Limit Here  ");
         
         String[] questions10 = {
                 "Which of these proverbs is used for someone who indulges in ‘khushamad’ ?",
                 "Which of these is the name a technique common to both wrestling and swimming?",
                 " In the Mahabharata, which of these kings married Duhsala, the only sister of the Kauravas ?",
                 "Which of these originated during the British Raj as Cachar Levy in 1835 ?",
                 "Which of these items are usually bought in a single piece, instead of buying as a pair ?"
         };

         String[][] options10 = {
                 {"(A) Aankhen Bichhana", "(B) Daant Todna", "(C) Taang Adaana ", "(D) Talve Chatna "},
                 {"(A)  Freestyle ", "(B)  Butterfly ", "(C) Greco-Roman", "(D) Medley"},
                 {"(A) Jarasandha", "(B) Somadatta", "(C) Shishupala", "(D) Jayadratha"},
                 {"(A) Madras Regiment", "(B) Assam Rifles", "(C)  Jat Regiment ", "(D) Rajputana Rifles"},
                 {"(A) Mojri", "(B) Dandiya sticks", "(C) Sunglasses", "(D) Gloves"}
         };

         String[] correctAnswers10 = {"D", "A", "D", "B", "C"};

            Random rand10 = new Random();
     int questionIndex10 = rand10.nextInt(5); // Random number between 0 and 4

     Scanner m10 = new Scanner(System.in);

     System.out.println("\t\t\t\t\t\t _____________________________");
     System.out.println("\t\t\t\t\t\t| Your Question for Rs 50,00,000 is |");
     System.out.println(questions10[questionIndex10] + "                                    \t\t|-----------Lifeline------------|");
     System.out.println(options10[questionIndex10][0] + "            " + options10[questionIndex10][1] + "                           \t\t| 1. 50:50                       |");
     System.out.println("                                                                                     \t\t| 2. Flip Question              |");
     System.out.println(options10[questionIndex10][2] + "            " + options10[questionIndex10][3] + "                           \t\t| 3. Audience Poll               |");
     System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");
     boolean gameContinues = true;
     while (gameContinues == true) {
         System.out.print("\nAns (or type 'lifeline' to use a lifeline):- ");
         String answer10 = m10.next();

         if (answer10.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
             // Lifeline logic
             lifelineUsed++;
             System.out.println("Choose your lifeline:");
             boolean lifelineAvailableFlag = false;

             for (int i = 0; i < lifelineAvailable.length; i++) {
                 if (lifelineAvailable[i]) {
                     lifelineAvailableFlag = true;
                     switch (i) {
                         case 0:
                             System.out.println("1. 50:50");
                             break;
                         case 1:
                             System.out.println("2. Flip Question");
                             break;
                         case 2:
                             System.out.println("3. Audience Poll");
                             break;
                         case 3:
                             System.out.println("4. Ask the Expert");
                             break;
                     }
                 }
             }

             if (!lifelineAvailableFlag) {
                 System.out.println("No lifelines available!");
                 break;
             }

             int lifelineChoice = m10.nextInt();

             if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
                 System.out.println("Invalid or already used lifeline choice. Try again.");
                 continue;
             }

             lifelineAvailable[lifelineChoice - 1] = false;

             switch (lifelineChoice) {
                 case 1:
                     System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                     printFiftyFiftyOptions(options10[questionIndex10], correctAnswers10[questionIndex10]);
                     break;
                 case 2:
                     // Flip Question logic here
                 	System.out.println("Flip Question: Choose a category from the following:");
                     String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                     for (int j = 0; j < categories.length; j++) {
                         System.out.println((j + 1) + ". " + categories[j]);
                     }
                     Scanner scanner = new Scanner(System.in);
                     int categoryChoice = scanner.nextInt();
                     if (categoryChoice < 1 || categoryChoice > 8) {
                         System.out.println("Invalid category choice.");
                         break;
                     }

                     System.out.println("You chose: " + categories[categoryChoice - 1]);

                     // Generate the question and retrieve the correct answer
                     String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                     // Prompt the user for their answer
                     System.out.print("\nYour Answer: ");
                     
                     String userAnswer = scanner.next();

                     // Validate the new answer
                     if (validateNewAnswer(userAnswer, correctAnswer)) {
                         System.out.println("Correct! Proceeding to the next round.");
                         // Update the winnings and proceed to the next question
                         rupess = 5000000; // Update the amount won for the round
                          previous(options10[questionIndex10], correctAnswers10[questionIndex10]); // Proceed to the next round

                     } else {
                         System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                         System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                         System.out.println("Thank you for playing!");
                         return; // End the game
                     }
                 case 3:
                     audiencePoll(options10[questionIndex10], correctAnswers10[questionIndex10]);
                     break;
                 case 4:
                     expert(options10[questionIndex10], correctAnswers10[questionIndex10]);
                     break;
             }
         } else if (!answer10.equalsIgnoreCase("lifeline")) {
         	 boolean answerLocked = false;
             while (!answerLocked) {
                 System.out.println("Do you want to lock it? (yes/no)");
                 String lockConfirmation = m10.next();

                 if (lockConfirmation.equalsIgnoreCase("yes")) {
                 	answerLocked = true;
                     // Validate the locked answer
                     if (answer10.equalsIgnoreCase(correctAnswers10[questionIndex10])) {
                         System.out.println("Yes, you are right! You won Rs.50,00,000");
                         rupess = 5000000;
                         gameContinues = false;
                         
                     } else {
                         System.out.println("Incorrect answer. The correct answer is: " + correctAnswers10[questionIndex10]);
                         System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                         gameContinues = false;
                         
                     }
                     break; // Exit the game after locking the answer
                 } else if (lockConfirmation.equalsIgnoreCase("no")) {
                     System.out.print("Re-enter your answer: ");
                     answer10 = m.next();
                 } else {
                     System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                 }
             }
         } else {
             System.out.println("Invalid input. Please type a valid answer or 'lifeline'.");
         }
     }
     String[] questions11 = {
             "In the film Jab Tak Hai Jaan, what is the title of the documentary made by Akira on Major Samar Anand ?",
             " In which mountain range does the river Narmada rise?",
             " Which of these woman actress to become Chairperson of the Central Board of film Certificate (Censor Board) ?",
             "According to Hindu mythology who drinks the vish “Kaal-Kut” obtained from ‘Sagar manthan ‘ ?",
             "Which of these numbers comes first while counting from 1 to 100 ?"
     };

     String[][] options11 = {
             {"(A)  The Man Who Cannot Die", "(B) The Secret Dairy", "(C) The Black Death", "(D) Living With the Superstar "},
             {"(A) Vindhya Range ", "(B)  Mahadeo Range  ", "(C) Maikala Range ", "(D) Rajpipla Hills"},
             {"(A) Sharmila Tagore", "(B) Nafisa Ali", "(C) Aparna Sen ", "(D) Asha Parekh"},
             {"(A) Lord Shiva", "(B) Lord Vishnu ", "(C) Maa  Ganga  ", "(D) Maa Durga "},
             {"(A)  Unsath ", "(B) Unhattar", "(C) Unnaasi ", "(D) Unchaas"}
     };

     String[] correctAnswers11 = {"A", "C", "D", "A", "D"};
        Random rand11 = new Random();
 int questionIndex11 = rand11.nextInt(5);
 Scanner m11 = new Scanner(System.in);

 System.out.println("\t\t\t\t\t\t _____________________________");
 System.out.println("\t\t\t\t\t\t| Your Question for Rs 1,00,00,000 is |");
 System.out.println(questions11[questionIndex11] + "                                    \t\t|-----------Lifeline------------|");
 System.out.println(options11[questionIndex11][0] + "            " + options11[questionIndex11][1] + "                           \t\t| 1. 50:50                       |");
 System.out.println("                                                                                     \t\t| 2. Flip Question              |");
 System.out.println(options11[questionIndex11][2] + "            " + options11[questionIndex11][3] + "                           \t\t| 3. Audience Poll               |");
 System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");
 boolean gameContinues1 = true;
 while (gameContinues == true) {
     System.out.print("\nAns (or type 'lifeline' to use a lifeline):- ");
     String answer11 = m11.next();

     if (answer11.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
         // Lifeline logic
         lifelineUsed++;
         System.out.println("Choose your lifeline:");
         boolean lifelineAvailableFlag = false;

         for (int i = 0; i < lifelineAvailable.length; i++) {
             if (lifelineAvailable[i]) {
                 lifelineAvailableFlag = true;
                 switch (i) {
                     case 0:
                         System.out.println("1. 50:50");
                         break;
                     case 1:
                         System.out.println("2. Flip Question");
                         break;
                     case 2:
                         System.out.println("3. Audience Poll");
                         break;
                     case 3:
                         System.out.println("4. Ask the Expert");
                         break;
                 }
             }
         }

         if (!lifelineAvailableFlag) {
             System.out.println("No lifelines available!");
             break;
         }

         int lifelineChoice = m11.nextInt();

         if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
             System.out.println("Invalid or already used lifeline choice. Try again.");
             continue;
         }

         lifelineAvailable[lifelineChoice - 1] = false;

         switch (lifelineChoice) {
             case 1:
                 System.out.println("50:50 Lifeline used. Two incorrect options removed.");
                 printFiftyFiftyOptions(options11[questionIndex11], correctAnswers11[questionIndex11]);
                 break;
             case 2:
                 // Flip Question logic here
             	System.out.println("Flip Question: Choose a category from the following:");
                 String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
                 for (int j = 0; j < categories.length; j++) {
                     System.out.println((j + 1) + ". " + categories[j]);
                 }
                 Scanner scanner = new Scanner(System.in);
                 int categoryChoice = scanner.nextInt();
                 if (categoryChoice < 1 || categoryChoice > 8) {
                     System.out.println("Invalid category choice.");
                     break;
                 }

                 System.out.println("You chose: " + categories[categoryChoice - 1]);

                 // Generate the question and retrieve the correct answer
                 String correctAnswer = generate(categories[categoryChoice - 1], scanner);

                 // Prompt the user for their answer
                 System.out.print("\nYour Answer: ");
                 
                 String userAnswer = scanner.next();

                 // Validate the new answer
                 if (validateNewAnswer(userAnswer, correctAnswer)) {
                     System.out.println("Correct! Proceeding to the next round.");
                     // Update the winnings and proceed to the next question
                     rupess = 10000000; // Update the amount won for the round
                      previous(options11[questionIndex11], correctAnswers11[questionIndex11]); // Proceed to the next round

                 } else {
                     System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                     System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                     System.out.println("Thank you for playing!");
                     return; // End the game
                 }
             case 3:
                 audiencePoll(options11[questionIndex11], correctAnswers11[questionIndex11]);
                 break;
             case 4:
                 expert(options11[questionIndex11], correctAnswers11[questionIndex11]);
                 break;
         }
     } else if (!answer11.equalsIgnoreCase("lifeline")) {
     	 boolean answerLocked = false;
         while (!answerLocked) {
             System.out.println("Do you want to lock it? (yes/no)");
             String lockConfirmation = m11.next();

             if (lockConfirmation.equalsIgnoreCase("yes")) {
             	answerLocked = true;
                 // Validate the locked answer
                 if (answer11.equalsIgnoreCase(correctAnswers11[questionIndex11])) {
                     System.out.println("Yes, you are right! You won Rs.1,00,00,000");
                     rupess = 10000000;
                     gameContinues1 = false;
                 } else {
                     System.out.println("Incorrect answer. The correct answer is: " + correctAnswers11[questionIndex11]);
                     System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                     gameContinues1 = false;
                 }
                 break; // Exit the game after locking the answer
             } else if (lockConfirmation.equalsIgnoreCase("no")) {
                 System.out.print("Re-enter your answer: ");
                 answer11 = m.next();
             } else {
                 System.out.println("Invalid input. Please enter 'yes' or 'no'.");
             }
         }
     } else {
         System.out.println("Invalid input. Please type a valid answer or 'lifeline'.");
     }
 }
        System.out.println("Congrats !! "+"You are a crorepati");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ALL THE BEST FOR NEXT QUESTION ");
        
 String[] questions12 = {
         "Which of these is not a book written by Chetan Bhagat ?",
         "Which country sent women athletes to compete in the Olympics for the first time in 2012 ?",
         "Which of these is an international code of distress signal as well as an abbreviation of a Hindi film title ?",
         "The Largest moon of which planet is named Titan?",
         "The father of which of these MPs in the 15th Lok Sabha is the current Chief Minister of a State ?"
 };

 String[][] options12 = {
         {"(A) Five Point Someone ", "(B) The 3 Mistakes of my Life ", "(C) Revolution 2020  ", "(D) The White Tiger "},
         {"(A) Iraq ", "(B) Turkey ", "(C) Saudi Arabia ", "(D)  Afghanistan"},
         {"(A) OMG ", "(B) DDLG ", "(C) JTHG ", "(D) SOS "},
         {"(A) Jupiter", "(B)  Saturn", "(C) Neptune", "(D) Uranus"},
         {"(A) Deepender Singh", "(B) Dushyant Singh", "(C) Agatha Sangma ", "(D) Dimple Yadav "}
 };

 String[] correctAnswers12 = {"D", "C", "D", "B", "A"};
    Random rand12 = new Random();
 int questionIndex12 = rand12.nextInt(5);
 Scanner m12 = new Scanner(System.in);

 System.out.println("\t\t\t\t\t\t _____________________________");
 System.out.println("\t\t\t\t\t\t| Your Question for Rs 3,00,00,000 is |");
 System.out.println(questions12[questionIndex12] + "                                    \t\t|-----------Lifeline------------|");
 System.out.println(options12[questionIndex12][0] + "            " + options12[questionIndex12][1] + "                           \t\t| 1. 50:50                       |");
 System.out.println("                                                                                     \t\t| 2. Flip Question              |");
 System.out.println(options12[questionIndex12][2] + "            " + options12[questionIndex12][3] + "                           \t\t| 3. Audience Poll               |");
 System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");
 boolean gameContinues2 = true;
 while (gameContinues2 == true) {
 System.out.print("\nAns (or type 'lifeline' to use a lifeline):- ");
 String answer12 = m12.next();

 if (answer12.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
     // Lifeline logic
     lifelineUsed++;
     System.out.println("Choose your lifeline:");
     boolean lifelineAvailableFlag = false;

     for (int i = 0; i < lifelineAvailable.length; i++) {
         if (lifelineAvailable[i]) {
             lifelineAvailableFlag = true;
             switch (i) {
                 case 0:
                     System.out.println("1. 50:50");
                     break;
                 case 1:
                     System.out.println("2. Flip Question");
                     break;
                 case 2:
                     System.out.println("3. Audience Poll");
                     break;
                 case 3:
                     System.out.println("4. Ask the Expert");
                     break;
             }
         }
     }

     if (!lifelineAvailableFlag) {
         System.out.println("No lifelines available!");
         break;
     }

     int lifelineChoice = m12.nextInt();

     if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
         System.out.println("Invalid or already used lifeline choice. Try again.");
         continue;
     }

     lifelineAvailable[lifelineChoice - 1] = false;

     switch (lifelineChoice) {
         case 1:
             System.out.println("50:50 Lifeline used. Two incorrect options removed.");
             printFiftyFiftyOptions(options12[questionIndex12], correctAnswers12[questionIndex12]);
             break;
         case 2:
             // Flip Question logic here
         	System.out.println("Flip Question: Choose a category from the following:");
             String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
             for (int j = 0; j < categories.length; j++) {
                 System.out.println((j + 1) + ". " + categories[j]);
             }
             Scanner scanner = new Scanner(System.in);
             int categoryChoice = scanner.nextInt();
             if (categoryChoice < 1 || categoryChoice > 8) {
                 System.out.println("Invalid category choice.");
                 break;
             }

             System.out.println("You chose: " + categories[categoryChoice - 1]);

             // Generate the question and retrieve the correct answer
             String correctAnswer = generate(categories[categoryChoice - 1], scanner);

             // Prompt the user for their answer
             System.out.print("\nYour Answer: ");
             
             String userAnswer = scanner.next();

             // Validate the new answer
             if (validateNewAnswer(userAnswer, correctAnswer)) {
                 System.out.println("Correct! Proceeding to the next round.");
                 // Update the winnings and proceed to the next question
                 rupess = 30000000; // Update the amount won for the round
                  previous(options12[questionIndex12], correctAnswers12[questionIndex12]); // Proceed to the next round

             } else {
                 System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                 System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                 System.out.println("Thank you for playing!");
                 return; // End the game
             }
         case 3:
             audiencePoll(options12[questionIndex12], correctAnswers12[questionIndex12]);
             break;
         case 4:
             expert(options12[questionIndex12], correctAnswers12[questionIndex12]);
             break;
     }
 } else if (!answer12.equalsIgnoreCase("lifeline")) {
 	boolean answerLocked = false;
     while (!answerLocked) {
         System.out.println("Do you want to lock it? (yes/no)");
         String lockConfirmation = m12.next();

         if (lockConfirmation.equalsIgnoreCase("yes")) {
         	 answerLocked = true;
             // Validate the locked answer
             if (answer12.equalsIgnoreCase(correctAnswers12[questionIndex12])) {
                 System.out.println("Yes, you are right! You won Rs.3,00,00,000");
                 rupess = 30000000;
                 gameContinues2 = false;
             } else {
                 System.out.println("Incorrect answer. The correct answer is: " + correctAnswers12[questionIndex12]);
                 System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                 gameContinues2 = false;
             }
             break; // Exit the game after locking the answer
         } else if (lockConfirmation.equalsIgnoreCase("no")) {
             System.out.print("Re-enter your answer: ");
             answer12 = m.next();
         } else {
             System.out.println("Invalid input. Please enter 'yes' or 'no'.");
         }
     }
 } else {
     System.out.println("Invalid input. Please type a valid answer or 'lifeline'.");
 }
 }
 String[] questions13 = {
         "Which of these Nobel Laureates was under arrest when he or she was declared a winner of the award ?",
         "Which of these is the name of a drink consumed by Hindu Gods?",
         "In the early phase of his career, which of these industrialists used to sell handmade detergent packets from door to door?",
         "Who was awarded the Param Vir Chakra for his bravery on 18 November 1962 at Rezang La in Ladakh?",
         "What was the title of the thesis that Dr. B. R. Ambedkar submitted to the London School of Economics for which he was awarded his doctorate in 1923?"
 };

 String[][] options13 = {
         {"(A) Martin Luther King Jr. ", "(B) Yasser Arafat", "(C) Aung San Suu Kyl  ", "(D) Nelson Mandela"},
         {"(A) Amrit Boond  ", "(B) Madhu Pan ", "(C) Ksheer Sagar", "(D) Som ras "},
         {"(A) Karsanbhai Patel ", "(B) Azim Premji", "(C) Gujarmal Modi", "(D) Brijmohan Lail Munjal"},
         {"(A) Major Dhan Singh Thapa", "(B) Major Shaitan Singh", "(C) Subedar Joginder Singh", "(D) Lt Col Ardeshir Tarapore"},
         {"(A) The Want and Means of India", "(B) National Dividend of India", "(C) The Problem of the Rupee ", "(D) The Law and Lawyers"}
 };

 String[] correctAnswers13 = {"C", "D", "A", "B", "C"};
    Random rand13 = new Random();
 int questionIndex13 = rand13.nextInt(5);
 Scanner m13 = new Scanner(System.in);

 System.out.println("\t\t\t\t\t\t _____________________________");
 System.out.println("\t\t\t\t\t\t| Your Question for Rs 5,00,00,000 is |");
 System.out.println(questions13[questionIndex13] + "                                    \t\t|-----------Lifeline------------|");
 System.out.println(options13[questionIndex13][0] + "            " + options13[questionIndex13][1] + "                           \t\t| 1. 50:50                       |");
 System.out.println("                                                                                     \t\t| 2. Flip Question              |");
 System.out.println(options13[questionIndex13][2] + "            " + options13[questionIndex13][3] + "                           \t\t| 3. Audience Poll               |");
 System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");
 boolean gameContinues3 = true;
 while (gameContinues3 == true) {
 System.out.print("\nAns (or type 'lifeline' to use a lifeline):- ");
 String answer13 = m13.next();

 if (answer13.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
     // Lifeline logic
     lifelineUsed++;
     System.out.println("Choose your lifeline:");
     boolean lifelineAvailableFlag = false;

     for (int i = 0; i < lifelineAvailable.length; i++) {
         if (lifelineAvailable[i]) {
             lifelineAvailableFlag = true;
             switch (i) {
                 case 0:
                     System.out.println("1. 50:50");
                     break;
                 case 1:
                     System.out.println("2. Flip Question");
                     break;
                 case 2:
                     System.out.println("3. Audience Poll");
                     break;
                 case 3:
                     System.out.println("4. Ask the Expert");
                     break;
             }
         }
     }

     if (!lifelineAvailableFlag) {
         System.out.println("No lifelines available!");
         break;
     }

     int lifelineChoice = m13.nextInt();

     if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
         System.out.println("Invalid or already used lifeline choice. Try again.");
         continue;
     }

     lifelineAvailable[lifelineChoice - 1] = false;

     switch (lifelineChoice) {
         case 1:
             System.out.println("50:50 Lifeline used. Two incorrect options removed.");
             printFiftyFiftyOptions(options13[questionIndex13], correctAnswers13[questionIndex13]);
             break;
         case 2:
             // Flip Question logic here
         	System.out.println("Flip Question: Choose a category from the following:");
             String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
             for (int j = 0; j < categories.length; j++) {
                 System.out.println((j + 1) + ". " + categories[j]);
             }
             Scanner scanner = new Scanner(System.in);
             int categoryChoice = scanner.nextInt();
             if (categoryChoice < 1 || categoryChoice > 8) {
                 System.out.println("Invalid category choice.");
                 break;
             }

             System.out.println("You chose: " + categories[categoryChoice - 1]);

             // Generate the question and retrieve the correct answer
             String correctAnswer = generate(categories[categoryChoice - 1], scanner);

             // Prompt the user for their answer
             System.out.print("\nYour Answer: ");
             
             String userAnswer = scanner.next();

             // Validate the new answer
             if (validateNewAnswer(userAnswer, correctAnswer)) {
                 System.out.println("Correct! Proceeding to the next round.");
                 // Update the winnings and proceed to the next question
                 rupess = 50000000; // Update the amount won for the round
                  previous(options13[questionIndex13], correctAnswers13[questionIndex13]); // Proceed to the next round

             } else {
                 System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                 System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                 System.out.println("Thank you for playing!");
                 return; // End the game
             }
         case 3:
             audiencePoll(options13[questionIndex13], correctAnswers13[questionIndex13]);
             break;
         case 4:
             expert(options13[questionIndex13], correctAnswers13[questionIndex13]);
             break;
     }
 } else if (!answer13.equalsIgnoreCase("lifeline")) {
 	 boolean answerLocked = false;
     while (!answerLocked) {
         System.out.println("Do you want to lock it? (yes/no)");
         String lockConfirmation = m13.next();

         if (lockConfirmation.equalsIgnoreCase("yes")) {
         	  answerLocked = true;
             // Validate the locked answer
             if (answer13.equalsIgnoreCase(correctAnswers13[questionIndex13])) {
                 System.out.println("Yes, you are right! You won Rs.5,00,00,000");
                 rupess = 50000000;
                 gameContinues3 = false;
             } else {
                 System.out.println("Incorrect answer. The correct answer is: " + correctAnswers13[questionIndex13]);
                 System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                 gameContinues3 = false;
             }
             break; // Exit the game after locking the answer
         } else if (lockConfirmation.equalsIgnoreCase("no")) {
             System.out.print("Re-enter your answer: ");
             answer13 = m.next();
         } else {
             System.out.println("Invalid input. Please enter 'yes' or 'no'.");
         }
     }
 } else {
     System.out.println("Invalid input. Please type a valid answer or 'lifeline'.");
 }
 }
    
 System.out.println(" JACKPOT QUESTION  :  ");

 System.out.println(" BE GIVE ALL YOUR KNOWLEDGE IN THIS QUESTION  ");
 for(int i = 0;i<4;i++) {
 	System.out.println();
 }



 String[] questions14 = {
         "Which of these artists was principally entrusted with the task of ‘illuminating’ the original document of the Constitution of India?",
         "Which of these was an alias used by Noor Inayat Khan to work as a spy for Britain in France during the Second World War?",
         "According to CNN, how much did Internet traffic increase between 1994 and 1996?",
         "Which tribal group is dominant in the 'Blue Mountains' of South India?",
         "Vishnu is a dwarf in which of his avatars?"
 };

 String[][] options14 = {
         {"(A) Ram Kinker Baij ", "(B) Benode Behari Mukherjee", "(C) Abanindranath Tagore ", "(D) Nandlal Bose"},
         {"(A) Vera Atkins", "(B) Jeanne-Marie Renier", "(C) Julienne Aisner", "(D) Krystyna Skarbek"},
         {"(A) Two times", "(B) Five times", "(C) Ten times", "(D) Twenty-five times"},
         {"(A) Todas", "(B) Lepchas", "(C) Lambadas", "(D) Chenchus"},
         {"(A) Vashishta", "(B) Varaha", "(C) Vamana", "(D) Kurma"}
 };

 String[] correctAnswers14 = {"D", "B", "D", "A", "C"};
    Random rand14 = new Random();
 int questionIndex14 = rand14.nextInt(5);
 Scanner m14 = new Scanner(System.in);

 System.out.println("\t\t\t\t\t\t JACKPOT QUESTION      ");
 System.out.println("\t\t\t\t\t\t| Your Question for Rs 7,00,00,000 is |");
 System.out.println(questions14[questionIndex14] + "                                    \t\t|-----------Lifeline------------|");
 System.out.println(options14[questionIndex14][0] + "            " + options14[questionIndex14][1] + "                           \t\t| 1. 50:50                       |");
 System.out.println("                                                                                     \t\t| 2. Flip Question              |");
 System.out.println(options14[questionIndex14][2] + "            " + options14[questionIndex14][3] + "                           \t\t| 3. Audience Poll               |");
 System.out.println("                                                                                     \t\t| 4. Ask the Expert              |");
 boolean game = true;
 while (game == true) {
 System.out.print("\nAns (or type 'lifeline' to use a lifeline):- ");
 String answer14 = m14.next();

 if (answer14.equalsIgnoreCase("lifeline") && lifelineUsed < 4) {
     // Lifeline logic
     lifelineUsed++;
     System.out.println("Choose your lifeline:");
     boolean lifelineAvailableFlag = false;

     for (int i = 0; i < lifelineAvailable.length; i++) {
         if (lifelineAvailable[i]) {
             lifelineAvailableFlag = true;
             switch (i) {
                 case 0:
                     System.out.println("1. 50:50");
                     break;
                 case 1:
                     System.out.println("2. Flip Question");
                     break;
                 case 2:
                     System.out.println("3. Audience Poll");
                     break;
                 case 3:
                     System.out.println("4. Ask the Expert");
                     break;
             }
         }
     }

     if (!lifelineAvailableFlag) {
         System.out.println("No lifelines available!");
         break;
     }

     int lifelineChoice = m14.nextInt();

     if (lifelineChoice < 1 || lifelineChoice > 4 || !lifelineAvailable[lifelineChoice - 1]) {
         System.out.println("Invalid or already used lifeline choice. Try again.");
         continue;
     }

     lifelineAvailable[lifelineChoice - 1] = false;

     switch (lifelineChoice) {
         case 1:
             System.out.println("50:50 Lifeline used. Two incorrect options removed.");
             printFiftyFiftyOptions(options14[questionIndex14], correctAnswers14[questionIndex14]);
             break;
         case 2:
             // Flip Question logic here
         	System.out.println("Flip Question: Choose a category from the following:");
             String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
             for (int j = 0; j < categories.length; j++) {
                 System.out.println((j + 1) + ". " + categories[j]);
             }
             Scanner scanner = new Scanner(System.in);
             int categoryChoice = scanner.nextInt();
             if (categoryChoice < 1 || categoryChoice > 8) {
                 System.out.println("Invalid category choice.");
                 break;
             }

             System.out.println("You chose: " + categories[categoryChoice - 1]);

             // Generate the question and retrieve the correct answer
             String correctAnswer = generate(categories[categoryChoice - 1], scanner);

             // Prompt the user for their answer
             System.out.print("\nYour Answer: ");
             
             String userAnswer = scanner.next();

             // Validate the new answer
             if (validateNewAnswer(userAnswer, correctAnswer)) {
                 System.out.println("Correct! Proceeding to the next round.");
                 // Update the winnings and proceed to the next question
                 rupess = 70000000; // Update the amount won for the round
                  previous(options14[questionIndex14], correctAnswers14[questionIndex14]); // Proceed to the next round

             } else {
                 System.out.println("Incorrect answer. The correct answer was: " + correctAnswer);
                 System.out.println("You have earned: Rs." + rupess); // Retain the previous winnings
                 System.out.println("Thank you for playing!");
                 return; // End the game
             }
         case 3:
             audiencePoll(options14[questionIndex14], correctAnswers14[questionIndex14]);
             break;
         case 4:
             expert(options14[questionIndex14], correctAnswers14[questionIndex14]);
             break;
     }
 } else if (!answer14.equalsIgnoreCase("lifeline")) {
 	 boolean answerLocked = false;
     while (!answerLocked) {
         System.out.println("Do you want to lock it? (yes/no)");
         String lockConfirmation = m14.next();

         if (lockConfirmation.equalsIgnoreCase("yes")) {
         	 answerLocked = true;
             // Validate the locked answer
             if (answer14.equalsIgnoreCase(correctAnswers14[questionIndex14])) {
                 System.out.println("Yes, you are right! You won Rs.7,00,00,000");
                 rupess = 70000000;
                 game = false;
             } else {
                 System.out.println("Incorrect answer. The correct answer is: " + correctAnswers14[questionIndex14]);
                 System.out.println("Thank you for playing!\nYour total winnings: Rs." + rupess);
                 game = false;
             }
             break; // Exit the game after locking the answer
         } else if (lockConfirmation.equalsIgnoreCase("no")) {
             System.out.print("Re-enter your answer: ");
             answer14 = m.next();
         } else {
             System.out.println("Invalid input. Please enter 'yes' or 'no'.");
         }
     }
 } else {
     System.out.println("Invalid input. Please type a valid answer or 'lifeline'.");
 }
 }
 System.out.println("\t\t\t\t************************************You Won*************************************");
 System.out.println("\t\t\t\t*                                                                              *");
 System.out.println("\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
 System.out.println("\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
 System.out.println("\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
 System.out.println("\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
 System.out.println("\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
 System.out.println("\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
 System.out.println("\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
 System.out.println("\t\t\t\t*                                                                              *");
 System.out.println("\t\t\t\t************************************You Won*************************************");

 

           }
        else if(enter==2){
            long part=System.currentTimeMillis();
            if(part%2==0){
                
            
           for(int clr=1;clr<=45;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
           long perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Which Bank is Banker of Bank ?");
           System.out.println("A.State bank of india\t\t\tB.RBI\n");
           System.out.println("C.Punjab National Bank\t\t\tD.ICIC Bank");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "B" :
               case "b" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("What is our national Animal ?");
           System.out.println("A.Zebra\t\t\tB.Lion\n");
           System.out.println("C.Tiger\t\t\tD.Elephant");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "B" :
               case "b" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
           }
             else if(perm%3==2){
           System.out.println("What is our national bird ?");
           System.out.println("A.peacock\t\t\tB.crow\n");
           System.out.println("C.parrot\t\t\tD.eagle");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
             }
       //--------------------------------------------------------------------------------------------------------------------------------------------------
       //--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("The language discovered by Gautam Bhuddha was ?");
           System.out.println("A.Bhojpuri\t\t\tB.magadhi\n");
           System.out.println("C.Pali\t\t\tD.Sanskrit");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "c" :
               case "C" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("which of the following English films was the first one to be dubbed in Hindi ?");
           System.out.println("A.Aladdin\t\t\tB.Universal Soldier\n");
           System.out.println("C.Speed\t\t\tD.iron man");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
           }
             else if(perm%3==2){
           System.out.println("Name of the player of Indian cricket team who 4 january 2013 was named as CEAT International Cricketer of the year 2012 ?");
           System.out.println("A.Yuvraj Singh\t\t\tB.gautam gambhir\n");
           System.out.println("C.Sachin Tendulkar\t\t\tD.Virat Kohli");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "d" :
               case "D" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
           
             }
        //33--------------------------------------------------------------------------------------------------------------------------------------------------
       //33--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Largest continent in the world is ?");
           System.out.println("A.Africa \t\t\tB.Asia \n");
           System.out.println("C.Australia\t\t\tD.Antarctica");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "b" :
               case "B" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("The India's Largest Rainfall is reported at?");
           System.out.println("A.sikkim\t\t\tB.Rajasthan \n");
           System.out.println("C.Mawsynram\t\t\tD.chamba");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
           }
             else if(perm%3==2){
           System.out.println("Who was the first Indian to be President of UN General assembly ?");
           System.out.println("A.Mrs. Vijay Lakshmi Pandit\t\t\tB. Ramesh Bhandari\n");
           System.out.println("C.Natwar Singh\t\t\tD.Krishna Menon");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
           
             }
        //44--------------------------------------------------------------------------------------------------------------------------------------------------
       //44--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("which king belongs the Lion capital at sarnath?");
           System.out.println("A.Chandragupta\t\t\tB.Kanishka\n");
           System.out.println("C.Harsha\t\t\tD.Ashoka");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "d" :
               case "D" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("The member of the Rajya sabha are elected by?");
           System.out.println("A.People\t\t\tB.Elected members of the legislative council \n");
           System.out.println("C.Elected members of legislative assembly\t\t\tD.Lok sabha");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
           }
             else if(perm%3==2){
           System.out.println("The first women in space was ?");
           System.out.println("A.Valentina tereshkova\t\t\tB.kalpana Chawla\n");
           System.out.println("C.Tamara Press\t\t\tD.Sally Ride");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "d" :
               case "D" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
           
             }
        //55--------------------------------------------------------------------------------------------------------------------------------------------------
       //55--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Plant bends towards the source of light on account of the movement of curvature known as?");
           System.out.println("A.Geotropism\t\t\tB.Thigmotropism\n");
           System.out.println("C.Chemotropism\t\t\tD.Phototropism");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "d" :
               case "D" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("The first recipient of Rajiv Gandhi's 'Khel Ratna' award was?");
           System.out.println("A. Vishwanathan Anand\t\t\tB.Leander Peas\n");
           System.out.println("C.Kapil Dev\t\t\tD.Limba Ram");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
             else if(perm%3==2){
           System.out.println("Name the Cricketer who has became the youngest Batsman to score  10000 Runs in test Cricket ?");
           System.out.println("A. Alastair Cook\t\t\tB.Sachin Tendulkar\n");
           System.out.println("C.Daniel Vettori\t\t\tD.Ricky Ponting");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
           
             }
         //66--------------------------------------------------------------------------------------------------------------------------------------------------
       //66--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("The leading state in Producing Paper is");
           System.out.println("A.Bihar\t\t\tB.West bengal\n");
           System.out.println("C.Kerala\t\t\tD.orissa");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "b" :
               case "B" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("Central Drug research Institute is located at ");
           System.out.println("A.Delhi\t\t\tB.Nagpur\n");
           System.out.println("C.Mysore\t\t\tD.Lukhnow");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "d" :
               case "D" :
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
             else if(perm%3==2){
           System.out.println("The peroson who is also known as flying sikh of India ?");
           System.out.println("A.Mohinder singh\t\t\tB.Joginder singh\n");
           System.out.println("C.Milkha singh\t\t\tD.Ajit singh");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong");
                    Thread.sleep(1500);
                 }
           
             }
        //77--------------------------------------------------------------------------------------------------------------------------------------------------
       //77--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Which city is known as garden city of india");
           System.out.println("A.Chandigarh\t\t\tB.Imphal\n");
           System.out.println("C.Shimla\t\t\tD.Banglore");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "d" :
               case "D" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong D.Banglore is right"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("The first indian to recive the nobel prize in literature was");
           System.out.println("A.Rabindranath Tagore\t\t\tB.C.V Raman\n");
           System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :
                   System.out.println("You are right ");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong A.RabinderNath Tagore");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
             else if(perm%3==2){
           System.out.println("Who is the first Asian winner of nobel prize ?");
           System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
           System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong C. C.V Raman is right");
                    Thread.sleep(1500);
                 }
           
             }
           
           
        
         //88--------------------------------------------------------------------------------------------------------------------------------------------------
       //88--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Which city is known as Big Apple");
           System.out.println("A.Tokoyo\t\t\tB.London\n");
           System.out.println("C.New York\t\t\tD.Banglore");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "c" :
               case "C" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong C.New York is right"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("which is the Largest Airport in the world ?");
           System.out.println("A.Dubbai International Airport\t\t\tB.King Khalid International\n");
           System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
           for(int clr=1;clr<=23;clr++){
               System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "b" :
               case "B" :
                   System.out.println("You are right ");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong A.RabinderNath Tagore");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
             else if(perm%3==2){
           System.out.println("Who is the first Asian winner of nobel prize ?");
           System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
           System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong C. C.V Raman is right");
                    Thread.sleep(1500);
                 }
             }
        //99--------------------------------------------------------------------------------------------------------------------------------------------------
       //99--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("How many languages and dialects are spoken by people all over the world? ");
           System.out.println("A. 6,000\t\t\tB. 9,000\n");
           System.out.println("C. 4,000\t\t\tD. 1,000 ");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "b" :
               case "B" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong B. 9000 is right"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("Approximately, how many people speak Chinese language? ");
           System.out.println("A. 1 billion\t\t\tB. 1 million\n");
           System.out.println("C. 1 lakh   \t\t\tD. 1 thousand");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "a" :
               case "A" :
                   System.out.println("You are right ");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong A.1 Billion is true");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
             else if(perm%3==2){
           System.out.println("The language with the richest vocabulary is: ");
           System.out.println("A. Hindi  \t\t\tB. French \n");
           System.out.println("C. English\t\t\tD. German");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong C. English is right");
                    Thread.sleep(1500);
                 }
           
             }
       //10--------------------------------------------------------------------------------------------------------------------------------------------------
       //10--------------------------------------------------------------------------------------------------------------------------------------------------
             for(int clr=1;clr<=25;clr++){
           System.out.println("");}
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
  
            perm=System.currentTimeMillis();
           if(perm%3==0){
           System.out.println("Which book has been printed in the maximum number of languages and these scripts");
           System.out.println("A. The Bible\t\t\tB. Hiraka Sutra\n");
           System.out.println("C. The Super Book\t\t\tGuliver Travel");
             for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
           switch(prac){
               case "a" :
               case "A" :      
                   System.out.println("You are right");
                   Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong A.The Bible is true"); 
                Thread.sleep(1500);    
               }
                     
      
           }
           else if(perm%3==1){
           System.out.println("The only religious book ever printed in a shorthand scripts is ");
           System.out.println("A. The Ramayana\t\t\tB. The Mahabharata\n");
           System.out.println("C. The bible   \t\t\tD. Guru Granth Sahib ");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-"); 
           String prac=m.next();
                 switch(prac){
               case "c" :
               case "C" :
                   System.out.println("You are right ");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong C.The Bible is true");
                    Thread.sleep(1500);
           }
                 
           
           
           
           }
           
         else if(perm%3==2){
           System.out.println("The oldest printed work in the world, which dates back to AD 868 is:");
           System.out.println("A. The Bible   \t\t\tB. The Hirake Sutra\n");
           System.out.println("C. The Ramayana\t\t\tD. The Mahabharata   ");
           for(int clr=1;clr<=23;clr++){
           System.out.println("");}
           System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");       
           String prac=m.next();
                 switch(prac){
               case "b" :
               case "B" :   
                   System.out.println("You are right");
                    Thread.sleep(1500);
               break;
               case "Exit" :
               case "exit" :
               return;
               default :
               System.out.println("you are wrong B.The Hirake Sutra is right");
                    Thread.sleep(1500);
                 }
           
             }
            }
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++           

           
        } else if(enter == 3) {
        	 GameSettingsMenu settingsMenu = new GameSettingsMenu();
             settingsMenu.displayMenu();
   
        }
        else if(enter == 4) {
          Scanner d = new Scanner(System.in);
          Random p = new Random();
        
          System.out.println("Do you Want to Analyze Your Performance ? ");
          String[] categories = {"History", "Science", "Geography", "Sports", "Entertainment", "Technology", "Mythology", "Literature"};
          double []acc = {86.5,78.9,82.53,76.65,65.34,92.54,75.25};
          double accuracy = acc[(int) p.nextDouble(acc.length)];
 
          String strength = categories[p.nextInt(categories.length)];
          String weakness = categories[p.nextInt(categories.length)];
          
          for(int i =0;i<10;i++) {
      		System.out.println(" ");
      		
      	}
          String ans = d.next();
          
          if(ans.equalsIgnoreCase("yes")) {
        	  System.out.println("\n===== Performance Summary =====");
        	  System.out.println("Accuracy is : " + accuracy);
        	  System.out.println("Strength Area: " + strength);
              System.out.println("Weakness Area: " + weakness);
              
              
              
              if (accuracy > 85) {
                  System.out.println("Great job! You're doing amazing!");
              } else if (accuracy > 70) {
                  System.out.println("Good effort! Keep practicing to improve.");
              } else {
                  System.out.println("Don't give up! Study harder and try again.");
              }  
        	  
          }else {
        	  System.out.print("Thanks ");
          }
        }
        else if(enter ==5) {
        	 System.out.println("Welcome to the 'Kaun Banega Crorepati' (KBC) Game!");
             System.out.println("KBC is a thrilling quiz game consisting of 14 challenging rounds, each bringing you closer to the grand prize.");
             System.out.println("Players will encounter a variety of intriguing questions, each with increasing difficulty levels.");
             System.out.println("To assist you on your journey, the game provides distinct lifelines, such as 50:50, Audience Poll, and Phone a Friend, which can be used strategically.");
             System.out.println("The catch is that every question must be answered within a given time limit, adding excitement and pressure to the game!");
             System.out.println();
             System.out.println("Additionally, KBC offers a Practice Section, where users can hone their quiz knowledge before diving into the main game.");
             System.out.println("For those who like to personalize their experience, KBC also features a Customizable Quiz mode.");
             System.out.println("In this mode, users can modify the game settings, such as the number of rounds, types of questions, and even set their own time limits.");
             System.out.println();
             System.out.println("At the end of it all, KBC provides a comprehensive Performance Analysis.");
             System.out.println("This includes details about your accuracy, the time you took to answer questions, your strongest areas, and areas where you can improve.");
             System.out.println("So get ready to test your knowledge, challenge your limits, and have fun with the KBC Game!");
        }
        else {
        	System.out.println("Created By : ");
        	System.out.println("1.Ayush Kalyan Meher ");
        	System.out.println("Linkedin ID : "+"http://www.linkedin.com/in/ayush-kalyan-meher");
        	for(int i = 0;i<5;i++){
        		System.out.println(" ");
        	}
        	System.out.println("2.Shraddha Suman ");
        	System.out.println("Linkedin ID : "+"https://www.linkedin.com/in/shraddha-suman-4193ab24a/");
        	for(int i = 0;i<5;i++){
        		System.out.println(" ");
        	}
        	System.out.println("3.Smruti Samal ");
        	System.out.println("Linkedin ID : "+"https://www.linkedin.com/in/smruti-samal-a19305341/");
        	return;


        	
        }
        
        // try
       } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Optional: cleanup code
        }
       

           
}}

