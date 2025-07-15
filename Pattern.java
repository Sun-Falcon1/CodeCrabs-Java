package ded;

public class Pattern {

	public static void main(String[] args) {
		//loop fopr p[rinting numbers descending order from 5 to 1 
		for(int i = 5 ; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
				
				//for moving the number to the next line 
			  if(j < i) {
				System.out.print("");
			}
			
		}
			System.out.println ();
	}

	}
}
