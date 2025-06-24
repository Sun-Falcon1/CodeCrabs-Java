package Theory;

import java.util.Scanner;
public class GcdTwoNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
				System.out.println("Enter num1: ");
				int num1 = input.nextInt();
				
				System.out.println("Enter num1: ");
				int num2 = input.nextInt();
				
				int  gcd=1;
				int k = 2;
				while(k<=num1 && k<=num2) {
					if(num1 % k==0 && num2 % k == 0) 
						gcd = k;
					k++;
						
					}
				System.out.println("GCD is "+ gcd);
				}
				

	}


