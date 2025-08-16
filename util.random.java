package chapterbBase;
import java.util.Random;
//implementing a random class 
public class GetSet{
	public static void main(String[] args) {
	
		Random random = new Random();
		
		boolean isPrime;
		isPrime = random.nextBoolean();
		
		if(isPrime) {
			System.out.println("Prime");	
		}else {
		System.out.println("Not Prime");
		}	
	}
}	
