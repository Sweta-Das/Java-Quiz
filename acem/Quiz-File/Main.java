import java.io.*;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){

        // Selecting options by user
        Scanner select = new Scanner(System.in);

        // reading question from file
       // readQuest quests = new readQuest();
        Score myScore = new Score();
        ScoreList scoreList = new ScoreList();
        //Score score = new Score();

        while(true){
            System.out.println("Welcome to the Quiz!!");
            System.out.println("\nChoose your options:");
            System.out.println("1. Play Quiz");
            System.out.println("2. HighScore");
            System.out.println("3. Exit");
            String user_selection = select.nextLine();

            switch(user_selection){

                case "1":
                    try {
                        readQuest.quests(args);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }myScore.score();

                    System.out.println("Do you want to play again? (y/n)");
                    Scanner input = new Scanner(System.in);
                    String check = input.nextLine();
                    if(check.equals("y") || check.equals("Y")){
                        try {
                            readQuest.quests(args);
                            myScore.score();
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        continue;
                        
                    }
                        
                    else{
                        select.close();
                    }
                 
                    break;

                case "2":
                    System.out.println("Top 5 High Scores...\n ");
                    scoreList.viewScore();
                    

                case "3":
                    System.out.println("Are you sure you want to exit? (y/n)");
                    Scanner input1 = new Scanner(System.in);
                    String check1 = input1.nextLine();
                    if(check1.equals("y") || check1.equals("Y")){
                        select.close();
                        System.exit(0);
                        break;
                    }
                     else
                        break;  
                default:
                    System.out.println("Invalid option!!");     
                    System.out.println("Choose again: ");
                    select.nextLine();  
            }
        }
    }
}
