/*
 take user mood as input and recommend a suitable music genre based on the mood

   happy : pop
   sad : blues
   energetic : rock
   calm : chillout

 */
import java.util.*;

public class MUSIC_GENERE_recommender{

    public void recommender()
    {
        Scanner scan= new Scanner(System.in);
        String mood ="";
        while(!(mood.equals("exit"))) {
            System.out.println("ENTER YOUR MOOD: ");
            mood = scan.nextLine();
            switch(mood){
                case "happy":
                      System.out.println("Pop");
                      break;
                case "sad":
                System.out.println("Blues");
                      break;
                case "energetic":
                      System.out.println("rock");
                      break;
                case "calm":
                    System.out.println("chillout");
                      break;
                case "exit":
                      break;
                default:
                     System.out.println("INVALID");
                    
            }
        }
    }
    public static void main(String[] arg)
    {
        MUSIC_GENERE_recommender ob= new MUSIC_GENERE_recommender();
        ob.recommender();
    }
}