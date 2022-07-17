import java.io.*;
import java.time.Instant;
import java.time.Duration;
import java.util.Scanner;

public class readQuest {

    /**
     * @param args
     * @throws Exception
     */
    Scanner scan = new Scanner(System.in);
    public String playerName(){

        System.out.println("Enter your name: ");
        return scan.nextLine();
    }    

    public static String quests(String[] args) throws Exception{
       
        Instant quizStart = Instant.now();
        // giving path of text file
        File doc = new File("D:/Java Files/src/com/acem/Quiz-File/Questions.txt");

        // reading text file
        FileReader fr = new FileReader(doc);

        try{
            // reading file line-by-line
            BufferedReader obj = new BufferedReader(new FileReader(doc));

            String str;
            for(int j=0; j<10; j++){
                for(int i = 0; i<2; i++){
                    str = obj.readLine();
                    String[] questions = str.split(":");
                        for (String q:questions){
                            System.out.println(q);
                        }
                }
                Scanner sc = new Scanner(System.in);
                String ans = sc.nextLine();
                if((ans.equals("a")) || (ans.equals("b")) || (ans.equals("c")) || (ans.equals("d"))){
                    return sc.nextLine();
                }
                    
                else
                    System.out.println("Invalid input");
            
             }
            obj.close();
            fr.close();
            
        }catch (IOException ex) {
            System.err.println("Error while reading file: "+ ex.getMessage());
       
        }
        Instant quizEnd = Instant.now();
        Duration timeTaken = Duration.between(quizStart, quizEnd);
        System.out.println("Time Taken: " +timeTaken);
        return null;
    }
}
