// showing the current time 
import java.util.Scanner;
public class CurrentTimeShowcase{
    public static void main(String[] args){
        //declarations
     long totalMiliseconds = System.currentTimeMillis();

     long totalSeconds = totalMiliseconds/1000;

     long currentSeconds = totalSeconds%60;

     long totalMinutes = totalSeconds/60;

     long currentMinutes = totalMinutes%60;

     long totalhours = totalMinutes/60;

     long currentHour = totalhours/24;

        System.out.println("The current time is " +currentHour + " hour "+ currentMinutes + " minutes and " +currentSeconds + " seconds" + " GMT ");


    }
}
