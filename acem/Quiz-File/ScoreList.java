import java.util.List;
import java.util.ArrayList;

public class ScoreList {
    
    List<String> scores = new ArrayList<>();
    public void addScore(String playerName, Integer score){
        scores.add(score + "\t" + playerName);
    }

    public void viewScore(){
        java.util.Collections.sort(scores);
        System.err.println("HighScores");
        int size = scores.size();

        if(size == 0){
            System.out.println("No highscores yet...");
            return;

        }else if(size <=5){
            for(String str:scores){
                System.out.println(str);
            }

        }else{
            displayScore();
        }
    }

    public int displayScore(){
        for(int i=0; i<5; i++){
            System.out.println(scores.get(i));
        }
        return 0;
    }
}
