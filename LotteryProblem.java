package Theory;
import java.util.Scanner;
public class LotteryProblem {

	public static void main(String[] args) {
		int lottery = (int) (Math.random() *100);//generates a random number within 1-99
		
		Scanner input = new Scanner (System.in);
	    
		System.out.print("Please benter your lucky number for lottery: ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery/10;
		
		int lotteryDigit2 = lottery%10;
		
		int guessDigit1 = guess/10;
		
		int guessDigit2 = guess%10;
		
		if(guess == lottery) {
			System.out.println("Congratulation! Your award is $10000");
		}
		else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) 
		{
			System.out.println("Congratulation! Your award is $3000");
		}
		else if(guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 
				||guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1) 		
		{
	       System.out.println("Congratulation! Your award is $1000");
}
       else {
	       System.out.println("No match. Program terminated!");
}
	}
}

