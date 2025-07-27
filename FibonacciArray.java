//2.	Take an integer from user, generate that many fibonacci numbers and store in an array. Display the array.

package somethimg;
 import java.util.Scanner;
public class FibonacciArray {
	public static void main(String[] args) {
		
		int firstNum= 0, seconNum =0 , count = 0;
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter an integer for fibonacci series : ");
		int user = input.nextInt();
		
		if(user<=0) {
			System.out.println("Enter a positive nuumber ");
			return;
		}
		
		int[] fibonacci = new int[user];
		
		for(int i =0; i<user ; i++) {
			if(i == 0) {		
				fibonacci[i] = 0;	
			}else if(i == 1) {
				fibonacci[i] = 1;	
			}else {
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			}
		}
		
		//printing the array 	
		System.out.println("Fibonacci Array of " + user + "numbers is: "  );
		for(int i = 0; i<user; i++) {
			System.out.print(fibonacci[i]+ " " );
		}
			
	}
}
			
			