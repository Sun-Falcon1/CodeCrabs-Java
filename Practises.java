package Theory;

//checking a year is leap year or not
import java.util.Scanner;
public class Practises {
	  public static void main(String[] args) {
	  
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a year : ");
	    int year = input.nextInt();
	    
	    if((year%4 == 0 && year%100 !=0) || (year%400 == 0)){
	    	System.out.print("Leap year !");
	    }else {
	    	System.out.print("Not a Leap year !");
	    	
	    }
	    input.close();
	  }
}