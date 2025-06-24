package Theory;

//checking with conditionals if a number is a multiple of 5 or divisor of 2
import java.util.Scanner;
public class Practises {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : "); //taking integer input 
		int integer= input.nextInt();
		
		if(integer % 5 == 0)  //multiple of 5
			System.out.println("HiFive ");	//prints Hifive
		
		if(integer%2 == 0) //divisible by 2
			System.out.println("HiEven");	//Prints HiEven
		
		input.close();
		}
	}
