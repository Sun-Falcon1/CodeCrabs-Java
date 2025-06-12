## today is Saturday and you and your friends are going to meet in 10 days. What day is in 10 days? 
public class Main{
    public static void main(String[] args){
       String[] days = { "sat" ,"sun" , "mon" , "tue", "wed", "thurs", "fri"};

       int today = 0; //todays index which is saturday
       int later = 10; // index 10 days later
      int meetingDay = (today + later)%7;
      String meetingDayFinal = days[meetingDay];

        System.out.println("Today is saturday ");
        System.out.println("The day after 10 days is "+ meetingDayFinal); // prints trhe final meetingday's index 



    }
}
