package chapterbBase;
import java.util.Scanner;

//pastry and ice cream parlor shopping cart 
public class GetSet{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Sunshine Paradise. Would you love to have some pastries/ ice creams? ");
		System.out.println("Enter 1 for yes , 2 for no.");
		
		int select = input.nextInt();
		
		 switch(select){
			 case 1: 
				 System.out.println("Yes");
				break;
			 case 2: 
				 System.out.println("No");
			default: 
				System.out.println("Eat chillies");
		 }
		
		
		System.out.println("Which item do you wanna buy? ");
		System.out.println("Select 1 for Ice-Cream , 2 for Pastries");
		int item = input.nextInt();
		
	
		switch(item){
		 case 1: 
			 System.out.println("Ice Cream");
			break;
		 case 2: 
			 System.out.println("Pastries");
		default: 
			System.out.println("Eat Jalapeño");
	 }
		
		System.out.println("Which flavour would you like? ");
		System.out.println("1. Butterscotch \2.Blueberry cheese. \3.Raspberry whipped cream. \4.Muffin Choco donut \"5. Lotus Oreo with dark choco fudge. ");
		int flavours = input.nextInt();
		
		
		switch(flavours) {
		case 1: 
			 System.out.println("Butterscotch");
			break;
		 case 2: 
			 System.out.println("Blueberry cheese");
	
		case 3: 
			 System.out.println("Raspberry whipped cream");
			break;
		 case 4: 
			 System.out.println("Muffin Choco donut");
			break;
		 case 5: 
			 System.out.println("Lotus Oreo with dark choco fudge");
		  default: 
			System.out.println("Go to hell");
		}
		
		System.out.println("What is the price for each ? ");
		int price = input.nextInt();
		
		System.out.println("What is the quantity you want to buy of that item ? ");
		int quantity = input.nextInt();
		
		System.out.println("You have bought " +quantity + flavours + "'s" + "and your payment is" + quantity*price);
		
	}
	}
