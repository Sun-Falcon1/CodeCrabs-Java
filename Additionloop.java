package Theory;

import java.util.Scanner;
 //An addition quiz . Executes until user gives the correct answer
public class Additionloop {

		public static void main(String[] args) {
			int number1 = (int) (Math.random() *10); //randomly generates integer 
			int number2 = (int) (Math.random() *10);
			
            //doing scanner for taking answer from user
			Scanner input = new Scanner(System.in);
			
			//user prompt
			System.out.print("what is " + number1 + " +" + number2 + " ?");
			int answer = input.nextInt();
			
			//loop execution ; while infinite loop for executing the prompt until user gets it right 
			while(number1+number2 != answer) {
				System.out.print("Wrong answer! Try Again! ");
				answer = input.nextInt();
			}
			
			System.out.print("You got it! ");
			}
			

	}
	


