package Main; // Main keyword is changeable. Defines your package type. Any word can be chosen. First word must be cap, rest would be small letters.

import java.util.Scanner;
public class Main{
 public static void main(String[] args){
     Scanner input = new Scanner (System.in);
      System.out.println("Enter an integer : ");
      int number = input.nextInt();
      
      if(number %2 ==0){
          System.out.println("Even");
      } else {
          System.out.println("Odd");
      }
      }
  }
  
