import java.io.FileWriter; 
public class ScoreWrite {

    public static void scoreWrite(String args[]){    
        ScoreList scl = new ScoreList();
         try{    
           FileWriter fw=new FileWriter("D:/Java Files/src/com/acem/Quiz-File/Scores.txt");    
           fw.write(scl.displayScore());    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
    
}
