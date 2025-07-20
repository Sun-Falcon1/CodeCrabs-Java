package golly;
import java.util.Scanner;
public class Bool {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter company code : ");
		int CompanyCode = input.nextInt();
		
		switch(CompanyCode) {
		case 1: 
			System.out.println("Microsoft ");
		break;
		case 2: 
			System.out.println("Apple Mac OS");
		break;
		default:
			System.out.println("Dell, HP, Lenovo, MSI, Gigabyte!");
		}
		
		
		}
		

	}


