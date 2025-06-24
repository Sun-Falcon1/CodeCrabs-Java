package Theory;

import java.util.Scanner;
public class Practises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int integer= input.nextInt();
		
		if(integer%5 == 0) 
			System.out.println("HiFive ");	
		
		if(integer%2 == 0) 
			System.out.println("HiEven");	
		}
	}


