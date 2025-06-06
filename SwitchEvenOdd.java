package Main;

import java.util.Scanner;
public class Main{
 public static void main(String[] args){
     Scanner input = new Scanner (System.in);
      System.out.println("Enter an integer : ");
      int number = input.nextInt();
      
      int result = number %2;
          
     switch(result) {
     case 0:
     System.out.println("Even");
     break;
     case 1:
     System.out.println("Odd");
     break;
     default:
     System.out.println("Command Invalid");
    	 
     }
 }
}
