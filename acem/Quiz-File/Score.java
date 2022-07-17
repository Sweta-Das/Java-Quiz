import java.util.Scanner;

public class Score {

    public int score(){
        readQuest ques = new readQuest();
        int myScore = 0;
        Scanner scan = new Scanner(System.in);

        String[] answers = {"c", "a", "d", "c", "a", "c", "c", "d", "b", "c"};  

    for (int i=0; i<10; i++){
       ////scan.next()
       if (scan.next().equals(answers))
            myScore++;
        else
            System.out.println("Incorrect"); 
            break;
    
    }  
    System.out.println("Total Score: "+myScore);
    return myScore;
    }   
}

